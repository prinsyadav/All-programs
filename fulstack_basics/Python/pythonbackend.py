from flask import Flask, jsonify, request

app = Flask(__name__)

# Sample data
todos = [
    {'id': 1, 'title': 'Learn Python'},
    {'id': 2, 'title': 'Build a Web App'},
]

@app.route('/todos', methods=['GET'])
def get_todos():
    return jsonify(todos)

@app.route('/todos', methods=['POST'])
def add_todo():
    todo = {'id': len(todos) + 1, 'title': request.json['title']}
    todos.append(todo)
    return jsonify(todo)

if __name__ == '__main__':
    app.run(debug=True)
import express from 'express';

const app = express();

app.get('/', (req, res) => {
    res.send('Server is ready');
});

app.get('/jokes', (req, res) => {
    const jokes = [
        {
            id: 1,
            title: 'a joke',
            content: ' This is s joke'
        },
        {
            id: 2,
            title: 'b joke',
            content: ' This is s joke'
        },
        {
            id: 3,
            title: 'c joke',
            content: ' This is s joke'
        },
        {
            id: 4,
            title: 'd joke',
            content: ' This is s joke'
        }
    ];
    res.send(jokes);
})

const port = process.env.port || 3000;

app.listen(port, () => {
    console.log('Serve at http://localhost:${port}');
});

// create a function in javascript that takes a number as an argument and returns the number multiplied by 2
function multiplyByTwo(number) {
    return number * 2;
}

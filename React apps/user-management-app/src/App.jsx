// App.js
import React, { useState } from "react";
import UserList from "./components/UserList";
import AddUser from "./components/AddUser";
import "./App.css";

function App() {
  const [showUsers, setShowUsers] = useState(false);
  const [showAddUser, setShowAddUser] = useState(false);

  return (
    <div className="App">
      <div className="button-container">
        <button
          onClick={() => {
            setShowUsers(true);
            setShowAddUser(false);
          }}
        >
          Users
        </button>
        <button
          onClick={() => {
            setShowAddUser(true);
            setShowUsers(false);
          }}
        >
          Add New User
        </button>
      </div>

      {showUsers && <UserList />}
      {showAddUser && <AddUser />}
    </div>
  );
}

export default App;

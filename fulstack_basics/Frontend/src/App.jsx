import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import axios from 'axios'
import UsersList from './components/UsersList'
import AddUsers from './components/AddUsers'
// import UpdateUsers from './components/UpdateUsers'

function App() {
  // const [jokes, setJokes] = useState([])
  
  // useEffect(() => {
  //   axios.get('/api/jokes')
  //     .then(response => {
  //       setJokes(response.data)
  //     })
  //     .catch(error => {
  //       console.log(error)
  //     })
  // })

  // useEffect(() => {
  //   fetchUsers();
  // }, []);

  // const fetchUsers = async () => {
  //   try {
  //     const response = await fetch('http://localhost:8080/users');
  //     // fetch image data for each user
  //     const data = await response.json();
  //     // const image = await response.blob();
  //     setUsers(data.sort((a, b) => a.id - b.id));
  //   } catch (error) {
  //     console.error('Error fetching users:', error);
  //   }
  // };

  const [showUsers, setShowUsers] = useState(false);
  const [showAddUser, setShowAddUser] = useState(false);
  // const [showUpdateUser, setShowUpdateUser] = useState(false);

  return (
    <div className="App">
      <div className="button-container">
        <button onClick={() => {
          setShowUsers(true);
          setShowAddUser(false);
        }}>Users</button>
        <button onClick={() => {
          setShowAddUser(true);
          setShowUsers(false);
        }}>Add New User</button>
        {/* <button onClick={() => {
          setShowUpdateUser(true);
          setShowUsers(false);
        }}>Update User</button> */}
      </div>

      {showUsers && <UsersList />}
      {showAddUser && <AddUsers />}
      {/* {showUpdateUser && <UpdateUsers />} */}
    </div>
  );
}

export default App;

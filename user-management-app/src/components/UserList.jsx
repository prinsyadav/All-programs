
import React, { useState, useEffect } from 'react';

function UserList() {
  const [users, setUsers] = useState([]);
  const [editingUser, setEditingUser] = useState(null);

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = async () => {
    try {
      const response = await fetch('http://localhost:8080/users');
      const data = await response.json();
      setUsers(data.sort((a, b) => a.id - b.id));
    } catch (error) {
      console.error('Error fetching users:', error);
    }
  };

  const handleRowClick = (user) => {
    setEditingUser({...user});
  };

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setEditingUser(prev => ({
      ...prev,
      [name]: value
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await fetch(`http://localhost:8080/users/${editingUser.id}`, {
        method: 'PUT',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(editingUser)
      });

      if (response.ok) {
        // Update the users list
        setUsers(users.map(user => 
          user.id === editingUser.id ? editingUser : user
        ));
        setEditingUser(null);
      }
    } catch (error) {
      console.error('Error updating user:', error);
    }
  };

  return (
    <div>
      <table>
        <thead>
          <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Country</th>
          </tr>
        </thead>
        <tbody>
          {users.map(user => (
            <tr key={user.id} onClick={() => handleRowClick(user)}>
              <td>
                {user.imageUrl && (
                  <img
                    src={`http://localhost:8080/users/image/${user.id}`}
                    alt={user.username}
                    style={{ width: '50px', height: '50px', objectFit: 'cover' }}
                  />
                )}
              </td>
              <td>{user.id}</td>
              <td>{user.username}</td>
              <td>{user.email}</td>
              <td>{user.country}</td>
            </tr>
          ))}
        </tbody>
      </table>

      {editingUser && (
        <form onSubmit={handleSubmit}>
          <h2>Edit User</h2>
          <div>
            <label>Username:</label>
            <input
              type="text"
              name="username"
              value={editingUser.username}
              onChange={handleInputChange}
            />
          </div>
          <div>
            <label>Email:</label>
            <input
              type="email"
              name="email"
              value={editingUser.email}
              onChange={handleInputChange}
            />
          </div>
          <div>
            <label>Country:</label>
            <input
              type="text"
              name="country"
              value={editingUser.country}
              onChange={handleInputChange}
            />
          </div>
          <button type="submit">Update User</button>
          <button type="button" onClick={() => setEditingUser(null)}>Cancel</button>
        </form>
      )}
    </div>
  );
}

export default UserList;
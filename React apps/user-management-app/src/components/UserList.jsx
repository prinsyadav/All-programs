
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
      // fetch image data for each user
      const data = await response.json();
      setUsers(data.sort((a, b) => a.id - b.id));
    } catch (error) {
      console.error('Error fetching users:', error);
    }
  };

  const handleRowClick = (users) => {
    setEditingUser({...users});
  };

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setEditingUser(prev => ({
      ...prev,
      [name]: value
    }));
  };

  // update user image
  const handleImageChange = (e) => {
    const file = e.target.files[0];
    const reader = new FileReader();

    reader.onloadend = () => {

      setEditingUser(prev => ({
        ...prev,
        filepath: file.name,
        image: reader.result
      }));
    };


  const handleSubmit = async (e) => {
    e.preventDefault();
    // update both image and user details 
    try {
      const formDataWithImage = new FormData();
      // Append JSON data as 'users'
      formDataWithImage.append(
        'users',
        new Blob([JSON.stringify({
          id: editingUser.id,
          username: editingUser.username,
          password: editingUser.password,
          email: editingUser.email,
          country: editingUser.country,
        })], { type: 'application/json' })
      );
      // Append the image file as 'imageData'
      if (editingUser.image) {
        formDataWithImage.append('imageData', editingUser.image);
      } else {
        alert('Please select an image.');
        return;
      }
      const response = await fetch('http://localhost:8080/users', {
        method: 'PUT',
        body: formDataWithImage,
      });
      if (response.ok) {
        alert('User updated successfully!');
        setEditingUser(null);
        fetchUsers();
      } else {
        alert('Error updating user');
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
            <th>Password</th>
            <th>Email</th>
            <th>Country</th>
          </tr>
        </thead>
        <tbody>
          {users.map(user => (
            <tr key={user.id} onClick={() => handleRowClick(users)}>
              <td>
                {user.filepath && (
                  <img
                    src={`http://localhost:8080/users/image/${user.id}`}
                    alt={user.username}
                    style={{ width: '50px', height: '50px', objectFit: 'cover' }}
                  />
                )}
              </td>
              <td>{user.id}</td>
              <td>{user.username}</td>
              <td>{user.password}</td>
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
            <label>ID:</label>
            <input
              type="text"
              name="id"
              value={editingUser.id}
              onChange={handleInputChange}
            />
          </div>
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
            <label>Password:</label>
            <input
              type="password"
              name="password"
              value={editingUser.password}
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

}

export default UserList;
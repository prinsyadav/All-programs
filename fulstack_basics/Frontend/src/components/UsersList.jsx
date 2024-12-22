import React, { useEffect, useState } from "react";
import axios from "axios";

function UsersList() {
    const [users, setUsers] = useState([]);
    const [editUser, setEditUser] = useState(null);

    useEffect(() => {
        fetchUsers();
    }, []);

    const handleRowClick = (users) => {
        setEditUser(users);
    };

    const handleInputChange = (e) => {
        setEditUser({ ...editUser, [e.target.name]: e.target.value });
    };

    const fetchUsers = async () => {
        try {
            const response = await fetch("http://localhost:8080/users");
            const data = await response.json();
            setUsers(data.sort((a, b) => a.id - b.id));
        } catch (error) {
            console.error("Error fetching users:", error);
        }
    };

    const handleUpdate = async () => {
        e.preventDefault();
        try {
            const response = await axios.put(`http://localhost:8080/users/${editUser.id}`, editUser);
            if (response.status === 200) {
                alert("User updated successfully!");
                setEditUser(null);
                fetchUsers();
            }
        } catch (error) {
            console.error("Error updating user:", error);
        }
    };

    return (

        <div>
            
            <div>
                <h1>User management portal</h1>
            </div>

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
                        {users.map((user) => (
                            <tr key={user.id}>
                                {/* <tr key={user.id} onClick={() => handleRowClick(users)}></tr> */}
                                <td>
                                {user.filepath && (
                                    <img
                                      src={`http://localhost:8080/users/image/${user.id}`}
                                      alt={user.username}
                                      style={{ width: '50px', height: '50px', objectFit: 'cover', borderRadius: '50%' }}
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

                {editUser && (  
                    <div>
                        <h2>Update User</h2>
                        <form onSubmit={handleUpdate}>
                            <label>
                                ID:
                                <input
                                    type="text"
                                    name="id"
                                    value={editUser.id}
                                    onChange={handleInputChange}
                                />
                            </label>
                            <br />
                            <label>
                                Username:
                                <input
                                    type="text"
                                    name="username"
                                    value={editUser.username}
                                    onChange={handleInputChange}
                                />
                            </label>
                            <br />
                            <label>
                                Password:
                                <input
                                    type="password"
                                    name="password"
                                    value={editUser.password}
                                    onChange={handleInputChange}
                                />
                            </label>
                            <br />
                            <label>
                                Email:
                                <input
                                    type="email"
                                    name="email"
                                    value={editUser.email}
                                    onChange={handleInputChange}
                                />
                            </label>
                            <br />
                            <label>
                                Country:
                                <input
                                    type="text"
                                    name="country"
                                    value={editUser.country}
                                    onChange={handleInputChange}
                                />
                            </label>
                            <br />
                            <button type="submit">Update</button>
                        </form>
                    </div>
                )}
            </div>
        </div>
    );
}

export default UsersList;
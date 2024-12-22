import React, { useState } from "react";
import axios from "axios";
import UsersList from "./UsersList";

function UpdateUsers() {

    const [formData, setFormData] = useState({
        id: "",
        username: "",
        password: "",
        email: "",
        country: "",
        image: null,
    });

    const [selectedImage, setSelectedImage] = useState(null);

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    };

    const handleImageChange = (e) => {
        setSelectedImage(e.target.files[0]);
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        try {
            // create a new FormData object
            const formDataObj = new FormData();

            // create user object
            const user = {
                id: formData.id,
                username: formData.username,
                password: formData.password,
                email: formData.email,
                country: formData.country,
            };

            // append the user object to the formDataObj
            formDataObj.append('users',
                new Blob([JSON.stringify(user)], { type: 'application/json' })
            );

            // append the image to the formDataObj
            if (selectedImage) {
                formDataObj.append('file', selectedImage);
            } else {
                alert('Please select an image.');
                return;
            }

            // send a POST request to the server
            axios.put("http://localhost:8080/users/{user.id}", formDataObj, {
                headers: {
                    "Content-Type": "multipart/form-data",
                },
            });

            if (response.status === 200) {
                alert('User added successfully!');
            }
        } catch (error) {
            console.error('Error adding user:', error);
        }
    };

    return (    
        <div>
            <h1>Update User</h1>
            <form onSubmit={handleSubmit}>
                <label>
                    ID:
                    <input
                        type="text"
                        name="id"
                        value={formData.id}
                        onChange={handleChange}
                    />
                </label>
                <br />
                <label>
                    Username:
                    <input
                        type="text"
                        name="username"
                        value={formData.username}
                        onChange={handleChange}
                    />
                </label>
                <br />
                <label>
                    Password:
                    <input
                        type="password"
                        name="password"
                        value={formData.password}
                        onChange={handleChange}
                    />
                </label>
                <br />
                <label>
                    Email:
                    <input
                        type="email"
                        name="email"
                        value={formData.email}
                        onChange={handleChange}

                    />

                </label>
                <br />
                <label>
                    Country:
                    <input
                        type="text"
                        name="country"
                        value={formData.country}
                        onChange={handleChange}
                    />
                </label>
                <br />
                <label>
                    Image:
                    <input
                        type="file"
                        name="image"
                        onChange={handleImageChange}
                    />
                </label>
                <br />
                <button type="submit">Add User</button>
            </form>
        </div>
    );
}

export default UpdateUsers;
// components/AddUser.js
import React, { useState } from 'react';

function AddUser() {
  const [formData, setFormData] = useState({
    id: '',
    username: '',
    password: '',
    email: '',
    country: '',
    image: null
  });
  const [selectedImage, setSelectedImage] = useState(null);

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleImageChange = (e) => {
    setSelectedImage(e.target.files[0]);
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
  
    try {
      const formDataWithImage = new FormData();
  
      // Append JSON data as 'users'
      formDataWithImage.append(
        'users',
        new Blob([JSON.stringify({
          id: formData.id,
          username: formData.username,
          password: formData.password,
          email: formData.email,
          country: formData.country,
        })], { type: 'application/json' })
      );
  
      // Append the image file as 'imageData'
      if (selectedImage) {
        formDataWithImage.append('imageData', selectedImage);
      } else {
        alert('Please select an image.');
        return;
      }
  
      const response = await fetch('http://localhost:8080/users', {
        method: 'POST',
        body: formDataWithImage,
      });
  
      if (response.ok) {
        alert('User added successfully!');
        setFormData({
          id: '',
          username: '',
          password: '',
          email: '',
          country: '',
          image: null,
        });
        setSelectedImage(null);
      } else {
        alert('Error adding user');
      }
    } catch (error) {
      console.error('Error adding user:', error);
      alert('Error adding user');
    }
  };
  
  return (
    <form onSubmit={handleSubmit}>
      <div className="form-group">
        <label>Profile Image:</label>
        <input
          type="file"
          accept="image/*"
          onChange={handleImageChange}
          required
        />
        {selectedImage && (
          <img
            src={URL.createObjectURL(selectedImage)}
            alt="Preview"
            style={{ width: '100px', marginTop: '10px' }}
          />
        )}
      </div>
      <div className="form-group">
        <label>ID:</label>
        <input
          type="integer"
          name="id"
          value={formData.id}
          onChange={handleChange}
          required
        />
      </div>
      <div className="form-group">
        <label>Username:</label>
        <input
          type="text"
          name="username"
          value={formData.username}
          onChange={handleChange}
          required
        />
      </div>
      <div className="form-group">
        <label>Password:</label>
        <input
          type="password"
          name="password"
          value={formData.password}
          onChange={handleChange}
          required
        />
      </div>
      <div className="form-group">
        <label>Email:</label>
        <input
          type="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
          required
        />
      </div>
      <div className="form-group">
        <label>Country:</label>
        <input
          type="text"
          name="country"
          value={formData.country}
          onChange={handleChange}
          required
        />
      </div>
      <button type="submit">Submit</button>
    </form>
  );
}

export default AddUser;
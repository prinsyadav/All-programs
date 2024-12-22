import React,{useState} from "react";
import axios from "axios";

function AddUsers() {
    const [formData, setFormData] = useState({
        id: "",
        username: "",
        password: "",
        email:"",
        country:"",
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
        axios.post("http://localhost:8080/users", formDataObj, {
            headers: {
                "Content-Type": "multipart/form-data",
            },
        });

        if (response.status === 200) {
            alert('User added successfully!');
            // Reset form
            setFormData({
              username: '',
              password: '',
              email: '',
              country: '',
              image: null
            });
            setSelectedImage(null);
          }
     } catch (error) {
        console.error("Error adding user:", error);
    }
};
    

    

    return (
        <div>
            <h1>Add a new user</h1>
            <form onSubmit={handleSubmit}>
                <div className="form-group">
                <label>
                    ID:
                    <input
                        type="text"
                        name="id"
                        value={formData.id}
                        onChange={handleChange}
                    />
                </label>
                </div>
                <div className="form-group">
                <label>
                    Username:
                    <input
                        type="text"
                        name="username"
                        value={formData.username}
                        onChange={handleChange}
                    />
                </label>
                </div>
                <div className="form-group">
                <label>
                    Password:
                    <input
                        type="password"
                        name="password"
                        value={formData.password}
                        onChange={handleChange}
                    />
                </label>
                </div>
                <div className="form-group">
                <label>
                    Email:
                    <input
                        type="email"
                        name="email"
                        value={formData.email}
                        onChange={handleChange}
                    />
                </label>
                </div>
                <div className="form-group">
                <label>
                    Country:
                    <input
                        type="text"
                        name="country"
                        value={formData.country}
                        onChange={handleChange}
                    />
                </label>
                </div>
                <div className="form-group">
                <label>
                    Image:
                    <input
                        type="file"
                        name="image"
                        accept="image/*"
                        onChange={handleImageChange}
                        required
                    />
                    {formData.image && (
                        <img
                            src={URL.createObjectURL(formData.image)}
                            alt="User"
                            style={{ width: "50px", height: "50px" }}
                        />
                    )}
                </label>
                </div>
                <button type="submit">Add user</button>
            </form>
        </div>
    );
}

export default AddUsers;

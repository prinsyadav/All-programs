import logo from './logo.svg';
import './App.css';
import React,{ useEffect, useState } from 'react';

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }

function MyButton() {
  return (
    <button>
      I'm a button
    </button>
  );
}

// Create a navigation bar component which will have 3 links
// Home
// About
// Contact

function NavBar() {
  return (
    <nav id="navBar">
      <ul>
        <li>Home</li>
        <li>About</li>
        <li>Contact</li>
      </ul>
    </nav>
  );
}

function Article() {
  return (
    <article class="article">
      <h1>My First Component</h1>
      <ol>
        <li>Components: UI Building Blocks</li>
        <li>Defining a Component</li>
        <li>Using a Component</li>
      </ol>
    </article>
    );
}

function FavoriteColor() {
  const [color, setColor] = useState("red");

  return (
    <>
      <h1>My favorite color is {color}!</h1>
      <button
        type="button"
        onClick={() => setColor("blue")}
      >Blue</button>
      <button
        type="button"
        onClick={() => setColor("red")}
      >Red</button>
      <button
        type="button"
        onClick={() => setColor("pink")}
      >Pink</button>
      <button
        type="button"
        onClick={() => setColor("green")}
      >Green</button>
    </>
  );
}

function Car() {
  const [car, setCar] = useState({
    brand: "Ford",
    model: "Mustang",
    year: "1964",
    color: "red"
  });

  const updateColor = () => {
    setCar(previousState => {
      return { ...previousState, color: "blue" }
    });
  }

  return (
    <>
      <h1>My {car.brand}</h1>
      <p>
        It is a {car.color} {car.model} from {car.year}.
      </p>
      <button
        type="button"
        onClick={updateColor}
      >Blue</button>
    </>
  )
}

// function Timer() {
//   const [count, setCount] = useState(0);

//   useEffect(() => {
//     setTimeout(() => {
//       setCount((count) => count + 1);
//     }, 1000);
//   }, [count]);

//     return (
//       <h1>I have rendered {count} times.</h1>
//     );
// }

function Component1() {
  const [user, setUser] = useState("Jesse Hall");

  return (
    <>
      <h1>{`Hello ${user}!`}</h1>
      <Component2 user={user} />
    </>
  );
}

function Component2({ user }) {
  return (
    <>
      <h1>Component 2</h1>
      <Component3 user={user} />
    </>
  );
}

function Component3({ user }) {
  return (
    <>
      <h1>Component 3</h1>
      <Component4 user={user} />
    </>
  );
}

function Component4({ user }) {
  return (
    <>
      <h1>Component 4</h1>
      <Component5 user={user} />
    </>
  );
}

function Component5({ user }) {
  return (
    <>
      <h1>Component 5</h1>
      <h2>{`Hello ${user} again!`}</h2>
    </>
  );
}

function Textbox(){
  return(
    <input type="text" placeholder="Enter your name"/>
  );
}

function Textbox1() {
  const [inputText, setInputText] = useState('');
  const [savedText, setSavedText] = useState('');

  const saveText = () => {
    setSavedText(inputText);
  };

  const handleInputChange = (e) => {
    setInputText(e.target.value);
  };

  return (
    <div style={{ display: 'flex', gap: '20px', alignItems: 'start' }}>
      <div>
        <textarea 
          id="textInput" 
          rows="5" 
          cols="50" 
          placeholder="Enter your text here"
          value={inputText}
          onChange={handleInputChange}
        />
        <br />
        <button onClick={saveText}>Save</button>
      </div>
      <div 
        style={{ 
          border: '1px solid #ccc', 
          padding: '10px', 
          minHeight: '100px', 
          minWidth: '200px' 
        }}
      >
        {savedText}
      </div>
    </div>
  );
}

function App() {
  return (
    <div class="mainFunction">
      <h1>Welcome to my app</h1>  
      <MyButton />
      <Article />
      <NavBar />
      <FavoriteColor />
      <Car />
      {/* <Timer /> */}
      <Component1/>
      <Textbox/>
      <Textbox1/>
    </div>
  );
}

export default App;


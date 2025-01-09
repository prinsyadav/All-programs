import { useState, useCallback, useEffect } from "react";
import { use } from "react";

function App() {
  const [length, setLength] = useState(8);
  const [numberAllowed, setNumberAllowed] = useState(false);
  const [specialCharAllowed, setSpecialCharAllowed] = useState(false);
  const [password, setPassword] = useState("");

  const passwordGenerator = useCallback(() => {
    const upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const lowerCase = "abcdefghijklmnopqrstuvwxyz";
    const numbers = "0123456789";
    const specialChar = "!@#$%^&*()_+";

    let characters = lowerCase + upperCase;
    if (numberAllowed) characters += numbers;
    if (specialCharAllowed) characters += specialChar;

    let password = "";
    for (let i = 0; i < length; i++) {
      password += characters.charAt(
        Math.floor(Math.random() * characters.length)
      );
    }

    setPassword(password);
  }, [length, numberAllowed, specialCharAllowed, setPassword]);

  const handleRangeChange = (event) => {
    setLength(event.target.value);
  };

  useEffect(() => {
    passwordGenerator();
  }, [length, numberAllowed, specialCharAllowed, passwordGenerator]);

  return (
    <>
      <div className="w-full max-w-md mx-auto shadow-md rounded-lg px-4 py-3 my-8 text-orange-500 bg-gray-800">
        <h1 className="text-center text-white my-3">Password Generator</h1>

        <div
          classname="flex shadow
          rounded-lg overflow-hidden mb-100"
        >
          <div className="outline-double w-fit rounded-xl ">
            <input
              type="text"
              value={password}
              className="outline-none w-full py-1 px-3"
              placeholder="password"
              readOnly
            />

            <button
              className="outline-none
               bg-blue-700
               text-white
               px-3
               py-0.5
               shrink-0"
            >
              Copy
            </button>

            <input
              onChange={handleRangeChange}
              type="range"
              value={length}
              min={8}
              max={100}
            />
            <label>Length:{length}</label>
          </div>
          <div className="flex items-center gap-x-1">
            <input
              defaultChecked={numberAllowed}
              className="text-white"
              type="checkbox"
              onChange={() => {
                setNumberAllowed((prev) => !prev);
              }}
            />
            <label>Numbers Allowed</label>
            <input
              className="text-white"
              type="checkbox"
              defaultChecked={specialCharAllowed}
              onChange={() => {
                setSpecialCharAllowed((prev) => !prev);
              }}
            />
            <label>Characters Allowed</label>
          </div>
        </div>
      </div>
    </>
  );
}

export default App;

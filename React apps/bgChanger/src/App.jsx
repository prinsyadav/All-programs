import { useState } from 'react';

function App() {
  
  const [color, setColor] = useState('Green');
  
  // const appStyles = {
  //   backgroundColor: color,
  //   height: '100vh', // Setting height to 100% of the viewport height
  //   display: 'flex', // Centering content
  //   alignItems: 'end',
  //   justifyContent: 'center',
  //   color: 'white',
  //   gap: '1rem',
  //   transition: 'background-color 0.5s ease', // Smooth color transition
  // };
 
  const getRandomColor = () => {
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
      color += letters[Math.floor(Math.random() * 16)];
    }
    setColor(color);
};


  return (
    <>
      <div className="w-full h-screen duration-200"  
      style={{backgroundColor: color}}>
        {/* <div style={{display:'flex', gap:'1rem', backgroundColor: 'white', padding: '1rem 2rem', borderRadius:'8px', margin:'5rem' }}>
          <button onClick={() => setColor('red')} style={{padding:'10px 20px', backgroundColor:'white',borderColor:color, borderRadius:'8px'}}>Red</button>
          <button onClick={() => setColor('green')}style={{padding:'10px 20px', backgroundColor:'white', borderColor:color, borderRadius:'8px'}}>Green</button>
          <button onClick={() => setColor('blue')} style={{padding:'10px 20px', backgroundColor:'white',borderColor:color, borderRadius:'8px'}}>blue</button>
          <button onClick={getRandomColor} style={{padding:'10px 20px', backgroundColor:'white',borderColor:color, borderRadius:'8px'}}>Random color</button>
  
        </div> */}
        <div className="fixed flex flex-wrap justify-center bottom-12 inset-x-0 px-2">
            <div className="flex flex-wrap justify-center gap-3 shadow-lg bg-white px-3 py-2 rounded-3xl">
            <button className='outline-one px-4 py-1
            rounded-full text-black shadow-lg'
            style={{backgroundColor:"Yellow", transition: 'background-color 0.5s ease'}} onClick={() => setColor("Red")}>Red</button>

            <button className='outline-one px-4 py-1
            rounded-full text-black shadow-lg'
            style={{backgroundColor:"Yellow", transition: 'background-color 0.5s ease'}} onClick={() => setColor("Black")}>Black</button>

            <button className='outline-one px-4 py-1
            rounded-full text-black shadow-lg'
            style={{backgroundColor:"Yellow", transition: 'background-color 0.5s ease'}} onClick={() => setColor("Blue")}>Blue</button>

            <button className='outline-one px-4 py-1
            rounded-full text-black shadow-lg'
            style={{backgroundColor:"Yellow", transition: 'background-color 0.5s ease'}} onClick={() => setColor("Yellow")}>Yellow</button>
            </div>
        </div>
      </div>
    </>
  )
}

export default App

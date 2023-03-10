import React, { useEffect, useState } from 'react';
import Mess from '../Mess/Mess'
import "./Messes.css"



const Messes = () => {
    const [messes, setMesses] = useState([]);
    

    useEffect( () =>{   
        fetch('http://localhost:8080/mess')
        .then(res => res.json())
        .then(data => setMesses(data))
    }, [])
    return (
        <div id='messes' className='container mb-5'>
            <h1 className='heading text-center  mt-5'>Popular Messes</h1>
            <div className='row'>
            {
                messes.map(mess => <Mess
                    key={mess.id}
                    mess={mess}
                ></Mess>)
            }
 
            </div>
            
        </div>
        
                
    );
};

export default Messes;
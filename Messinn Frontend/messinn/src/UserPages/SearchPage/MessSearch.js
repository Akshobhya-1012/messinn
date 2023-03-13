import React, { useEffect, useState } from 'react';
import Mess from '../Mess/Mess'
import '../SearchPage/MessSearch.css'



const MessSearch = () => {
    const [messes, setMesses] = useState([]);
    

    useEffect( () =>{   
        fetch('http://localhost:8080/mess',{method:"GET",credentials:'include'})
        .then(res => res.json())
        .then(data => setMesses(data))
    }, [])
    return (
        <div id='messes' className='container mb-5'>
            <h1 className='heading text-center  mt-5'>Messes nearby you</h1>
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

export default MessSearch;
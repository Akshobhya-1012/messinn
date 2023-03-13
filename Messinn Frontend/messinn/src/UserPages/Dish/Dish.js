
import React, { useEffect, useState } from 'react'
import Mess from '../Mess/Mess';

function Dish() {
    const [dish, setDishes] = useState([]);
    useEffect( () =>{   
        fetch('http://localhost:8080/dish',{method:"GET",credentials:'include'})
        .then(res => res.json())
        .then(data => setDishes(data))
    }, [])
    return (
        <div id="demo">
            <table className="table table-striped table-hover">
                        <thead className="thead-light">
                            <tr>
                                <th>Mess Items</th>
                                {/* <th>No</th> */}
                                
                               
                            </tr>
                        </thead>
                        <tbody>
                        {dish.map((mess)=> {
                        return (
                
                        <tr>
                        {/* <td>{mess.id}</td> */}
                        {/* <td>{mess.description}</td> */}
                        <td>{mess.name}</td>
                        {/* <td>{mess.price}</td> */}
                        </tr>
                
            )})
        }   
                        </tbody>
            </table>
        </div>
)
};
                


export default Dish;

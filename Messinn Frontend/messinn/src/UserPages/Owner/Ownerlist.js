
import React from 'react'
import { useState, useEffect } from 'react';
import config from '../../config'
import './Ownerlist.css'


function Ownerlist() {
    const[record,setRecord] = useState([])
 
   const getData = () =>
   {
       fetch(config.serverURL+'/admin')
       .then(response=> response.json())
       .then(res=>setRecord(res))
   
   }
 
   useEffect(() => {
      getData();
   },[])
  return (
        <div className="row ">
            <div className="page-title">
              <h1>
                Owners
              </h1>

                <div className="w-auto p-3">
                    <table className="table table-striped table-hover">
                        <thead className="thead-light">
                            <tr>
                                <th>No</th>
                                <th>Owner Name</th>
                                <th>Email</th>
                                <th>Mobile No</th>
                                <th></th>
                               
                            </tr>
                        </thead>
                        <tbody>
                         {record.map((output)=>
                            <tr>
                                <td>{output.id}</td>
                                <td>{output.name}</td>
                                <td>{output.email}</td>
                                <td>{output.mob}</td>
                                
                               

                           
                            </tr>
                           )}
                           
                            
                           
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        
  )
}

export default Ownerlist

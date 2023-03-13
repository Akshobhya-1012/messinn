import React from 'react'
import { useState, useEffect } from 'react';
import config from '../../config'

function Customerlist() {
const[record,setRecord] = useState([])
const[mess,setMess] = useState([])
 
   const getData = () =>
   {
       fetch(config.serverURL+'/customer',{credentials:'include'})
       .then(response=> response.json())
       .then(res=>setRecord(res))
   }

  //  const getMess = () =>
  //  {
  //   fetch(config.serverURL+'/customer/'+messId,{credentials:'include'})
  //   .then(response=> response.json())
  //   .then(res=>setMess(res))
  //  }

    useEffect(() => {
        getData();
        // getMess();
    },[])
  return (
    <div>
      <div className="page-title">
              <h1>
                Customers
              </h1>

                <div className="w-auto p-3">
                    <table className="table table-striped table-hover">
                        <thead className="thead-light">
                            <tr>
                                <th>No</th>
                                <th>Customer Name</th>
                                <th>Email</th>
                                <th>Mobile No</th>
                                <th>Mess</th>
                               
                            </tr> 
                        </thead>
                        <tbody>
                         {record.map((output)=>
                            <tr>
                                <td>{output.id}</td>
                                <td>{output.name}</td>
                                <td>{output.email}</td>
                                <td>{output.mob}</td>
                               
                               <td>{output.myMess.name}</td>
                           
                            </tr>   
                           )}
                           
                            
                           
                        </tbody>
                    </table>
                </div>
            </div>
    </div>
  )
}

export default Customerlist

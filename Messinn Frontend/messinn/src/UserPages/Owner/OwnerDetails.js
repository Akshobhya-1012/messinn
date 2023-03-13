
import React from "react";
import { useState ,useEffect} from "react"
import { Link } from "react-router-dom"
import ModeEditIcon from '@mui/icons-material/ModeEdit';
import DeleteIcon from '@mui/icons-material/Delete';
import './OwnerDetails.css'

// import {ArrowLeftCircleFill} from 'react-bootstrap-icons';
import Header from './../Shared/Header/Header';

function OwnerDetails() {
    
        const [owners, setOwners] = useState([]);
        let [flag,setflag]=useState(false);

        useEffect( () =>{
            fetch('http://localhost:8080/admin',{
                method:"GET",credentials:'include'
            })
            .then(res => res.json())
            .then(data => setOwners(data))
        }, [])

    useEffect( () =>{
        fetch('http://localhost:8080/admin',{
            method:"GET",credentials:'include'
        })
        .then(res => res.json())
        .then(data => setOwners(data))
    }, [flag])

    const deleteData=(id)=>{
        fetch('http://localhost:8080/admin/'+id,{
            method:"DELETE",credentials:'include'
        })
        .then((result)=>{
            console.log(result.data);
           // history.push("/");
           setflag(true);
        })
        .catch((err)=>{
            console.log("error occured",err);
        })
    
    }
    
    return (
        <>
        
        <div  style={{align:"center"}} >
            <div>
            <h1 className="page-title">Owners</h1>
        
            </div>
        </div>
        <div  className="w-75 p-3 mx-auto shadow-sm p-3 mb-3 bg-body-tertiary rounded " >
    <table className="table table-striped border-top">
        <thead>
            <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>MobileNo</th>
            <th>Edit</th>
            <th>Remove</th>
            </tr>
        </thead>
        <tbody>
            {owners.map((owner)=> {
                 return (
                    <tr>
                        <td>{owner.id}</td>
                        <td>{owner.name}</td>
                        <td>{owner.email}</td>
                        <td>{owner.mob}</td>
                        <td> 
                        
                        <Link to={{pathname:`/edit/${owner.id}`}} state={{test: 'test'}}>
                       < ModeEditIcon/>
                        </Link>
                    </td>
                    <td>
                    <button type="button" className="btn btn-danger" name='btn' id="delete" onClick={()=>deleteData(owner.id)}><DeleteIcon/></button>
                    </td>
                    </tr>
    
       )        
            })}
        </tbody>
    </table>
    
    </div>
   
        </>
    );
};
export default OwnerDetails;
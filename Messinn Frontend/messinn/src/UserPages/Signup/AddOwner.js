import { useEffect,useState } from "react";
import axios from "axios";
import { Link ,useNavigate,useParams} from "react-router-dom";


const AddOwner=()=>{
    const [mgrob,setmgrob]=useState({id:"",name:"",email:"",password:"",mob:""});
    //get the history object
    const navigate = useNavigate();
   
    const cid  = useParams();
    const addOwner = () => {
      
        axios.post('http://localhost:8080/admin/', mgrob).then((response) => {
          if (response.status === 200) {
            alert('Successfully added Owner')
            navigate("/ownerdetails");
          } else {
            alert('error while adding Manager')
          }
        })
      
    }
    const handleChange=(event)=>{
        const {name,value}=event.target;
        setmgrob({...mgrob,[name]:value});
    }
    return (
        <div className="w-75 p-3 mx-auto shadow-sm p-3 mb-5 bg-body-tertiary rounded " >
        <h1 className="page-title">Add Owner</h1>
        <form>
  <div className="form-group">
    <label htmlFor="mgrid">Owner Id</label>
    <input type="text" className="form-control" name="id" id="id" 
    value={cid.id}
    readOnly
   />
  </div>
  <div className="form-group">
    <label htmlFor="firstName">Owner Name</label>
    <input type="text" className="form-control" name="name" id="name"
     value={mgrob.name}
     onChange={handleChange}
     placeholder="Enter FirstName"/>
  </div>
  
  <div className="form-group">
    <label htmlFor="email">Email</label>
    <input type="text" className="form-control" name="email" id="email"
     value={mgrob.email}
     onChange={handleChange}
     placeholder="Enter Email"/>
  </div>
  <div className="form-group">
    <label htmlFor="email">Password</label>
    <input type="password" className="form-control" name="password" id="password"
     value={mgrob.password}
     onChange={handleChange}
     placeholder="Enter Password"/>
  </div>
  <div className="form-group">
    <label htmlFor="mobileNumber">Mobile Number</label>
    <input type="text" className="form-control" name="mob" id="mob"
     value={mgrob.mobileNumber}
     onChange={handleChange}
     placeholder="Enter MobileNumber"/>
  </div>
   <div className="mx-auto" >
  <button type="button" className="btn btn-primary" onClick={addOwner} style={{align:"center"}}>Signup</button>
  &nbsp; &nbsp; &nbsp;  
  <Link to="/servicecenters">
          <a className="btn btn-warning" style={{align:"center"}}>Back</a>
    </Link>
    </div>
</form>
      </div>
    );
}

export default AddOwner;

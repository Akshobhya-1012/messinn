import { useEffect,useState } from "react";
import axios from "axios";
import { Link ,useNavigate,useParams} from "react-router-dom";


const AddMess=()=>{
    const [mgrob,setmgrob]=useState({name:"",address:"",mob:"",ownerid:""});
    //get the history object
    const navigate = useNavigate();
   
    
    const addMess = () => {
      
        axios.post('http://localhost:8080/mess/addmess', mgrob,{withCredentials:"true"})
        .then((response) => {
          if (response.status === 200) {
            alert('Successfully added Owner')
            navigate("/owner");
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
        <h1 className="page-title">Add Mess</h1>
        <form>

  <div className="form-group">
    <label htmlFor="firstName">Mess Name</label>
    <input type="text" className="form-control" name="name" id="name"
     value={mgrob.name}
     onChange={handleChange}
     placeholder="Enter Mess Name"/>
  </div>
  
  <div className="form-group">
    <label htmlFor="email">Address</label>
    <input type="text" className="form-control" name="address" id="address"
     value={mgrob.address}
     onChange={handleChange}
     placeholder="Enter Address"/>
  </div>
  
  <div className="form-group">
    <label htmlFor="mobileNumber">Mobile Number</label>
    <input type="text" className="form-control" name="mob" id="mob"
     value={mgrob.mobileNumber}
     onChange={handleChange}
     placeholder="Enter MobileNumber"/>
  </div>
  <div className="form-group">
    <label htmlFor="ownerid">OwnerId</label>
    <input type="text" className="form-control" name="ownerid" id="ownerid"
     value={mgrob.ownerid}
     onChange={handleChange}
     placeholder="Enter OwnerId"/>
  </div>
  {/* <div className="form-group">
    <label htmlFor="image">Image</label>
    <input type="file" className="form-control" name="image" id="image"
     value={mgrob.image}
     onChange={handleChange}
     placeholder="Enter MobileNumber"/>
  </div> */}
   <div className="mx-auto" >
  <button type="button" className="btn btn-primary" onClick={addMess} style={{align:"center"}}>Add Mess</button>
  &nbsp; &nbsp; &nbsp;  
  <Link to="/owner">
          <a className="btn btn-warning" style={{align:"center"}}>Back</a>
    </Link>
    </div>
</form>
      </div>
    );
}

export default AddMess;

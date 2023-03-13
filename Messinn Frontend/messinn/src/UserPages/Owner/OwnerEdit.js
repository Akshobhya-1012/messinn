import { useEffect,useState } from "react";
import { useNavigate,useParams} from "react-router-dom";
import axios from "axios";
import './OwnerEdit.css'

const OwnerEdit=(props)=>{
    const param=useParams();
    console.log(param.id)
    const [owner,setOwner]=useState({id:"",name:"",email:"",password:"",mob:""});
 
    const navigate = useNavigate();

    
    useEffect(()=>{
        fetch('http://localhost:8080/admin/'+param.id,{
            method:"GET",credentials:'include'
        })
        .then(resposne=> resposne.json())
        .then(res=>setOwner(res))
        //   navigate("/managers");
    },[])
   
    // const updateData=()=>{
    //     fetch('http://localhost:8080/manager/'+mgrob.id,mgrob,{
    //         method:"PUT"
    //     })
    //     .then((result)=>{
    //         console.log(result.data);
    //         navigate("/managers");
    //     })
    //     .catch(()=>{})
    // }
    const updateData=()=>{
        axios.post('http://localhost:8080/owner/update',owner)
        .then((res)=>{console.log(res);
            navigate("/ownerdetails");
        }).catch((err)=>{console.log(err)})
    }

    const handleChange=(event)=>{
        const {name,value}=event.target;
        setOwner({...owner,[name]:value});
        console.log(owner.id)
    }
    return(
        <div className="w-75 p-3 mx-auto shadow-sm p-3 mb-5 bg-body-tertiary rounded ">
 <form >
  <div className="form-group">
    <label htmlFor="mgrid">Owner Id</label>
    <input type="text" className="form-control" name="id" id="id" 
    value={owner.id}
    readOnly
   />
   </div>

  <div className="form-group">
    <label htmlFor="name" className="form-control">Name</label>
    <input type="text" className="form-control" name="name" id="name"
     value={owner.name}
     onChange={handleChange}
     placeholder="Enter Name"/>
  </div>
 
  <div className="form-group">
    <label htmlFor="email" className="form-control">Email</label>
    <input type="text" className="form-control" name="email" id="email"
     value={owner.email}
     onChange={handleChange}
     placeholder="Enter Email"/>
  </div>
  <div className="form-group">
    <label htmlFor="mobileNumber" className="form-control">Mobile Number</label>
    <input type="text" className="form-control" name="mob" id="mob"
     value={owner.mob}
     onChange={handleChange}
     placeholder="Enter MobileNumber"/>
  </div>
  <button type="button" id="btn" className="btn btn-primary" onClick={updateData}>update Owner</button>
</form>
        </div>
        
        
    )
}

export default OwnerEdit;
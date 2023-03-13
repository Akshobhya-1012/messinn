import { Button } from "react-bootstrap";
import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";
import useMessDetails from "../hooks/useMessDetails"
import './MessDetails.css'
import config from "../../config";
import axios from "axios";
import Dish from './../Dish/Dish';

const MessDetails = () => {

  const params  = useParams();
  

  // 
  // const [mess] = useMessDetails(messId.messId);

  const [mess, setMess] = useState([]);
    useEffect(() =>{
      //const messId=params.messId
      
        axios.get('http://localhost:8080/mess/getbyid/'+params.messId,{withCredentials:"true"})
        // .then(res =>res.json())
        .then(data => {setMess(data.data)
        console.log(mess);})
    }, []);  
   
    return (
    <div className="center">
      <h1 id="text">Mess Details</h1>
        <div className="card mx-auto mb-3" style={{ width: "27rem" }}>
        <img id="id" className="card-img-top" alt="" src={mess.image}/>
        <div className="card-body text-center">
          <h3 className="card-title">{mess.name}</h3>
          <p className="card-text">{mess.address}</p>
          <p>Mobile : {mess.mob}</p>
          {/* <Link to={`/mess/getbyid/${messId}`}>
            <Button className="btn btn-primary">Process checkout</Button>
          </Link> */}
          
        </div>
      </div>
      <div id="menu">
        Today's Menu
        <Dish></Dish>
      </div>
      
    </div>
  );
};

export default MessDetails;
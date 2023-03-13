import React from "react";
import { useNavigate } from "react-router-dom";
import "./Mess.css"

const Mess = ({ mess }) => {
  const {id, name,image, mob, address } = mess;  
  const navigate = useNavigate();

  const navigateToDetails = id =>{
    navigate(`/mess/getbyid/${id}`);
  }
  return (
    <div className="g-4 gx-5 col-sm-12 col-md-6 col-lg-4 text-center">
      <div  className="card mx-10" style={{ width: "22rem" }}>
        <img id="id" src={image} className="cd" variant="top" alt="..." />
        <div className="card-body ">
          <h5 className="card-title">{name}</h5>
          <p className="card-text">
            {address}
          </p>
          <p className="card-text">
            Mobile: {mob}
          </p>
          <button onClick={ () => navigateToDetails(id)} className="btn btn-primary">
            Visit {name}
          </button>
        </div>
      </div>
    </div>

  );
};

export default Mess;

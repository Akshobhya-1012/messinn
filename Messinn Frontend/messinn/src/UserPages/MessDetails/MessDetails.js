import { Button } from "react-bootstrap";
import { Link, useParams } from "react-router-dom";
import useMessDetails from "../hooks/useMessDetails"
import PageTitle from "../Shared/PageTitle/PageTitle";


const MessDetails = () => {
  const { messId } = useParams();
  const [mess] = useMessDetails(messId);
  return (
    <div>
      <h1 className="service-h1">Mess Details</h1>
      <PageTitle title="service details"></PageTitle>
      <div className="card mx-auto mb-5" style={{ width: "40rem" }}>
        <img className="card-img-top" src={mess.image}/>
        <div className="card-body text-center">
          <h3 className="card-title">{mess.name}</h3>

          <p className="card-text">{mess.address}</p>
          <p>Mobile : {mess.mob}</p>
          <Link to={`/checkout/${messId}`}>
            <Button className="btn btn-primary">Process checkout</Button>
          </Link>
        </div>
      </div>
    </div>
  );
};

export default MessDetails;
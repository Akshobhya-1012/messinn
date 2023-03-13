import React from "react";
import PageTitle from "../Shared/PageTitle/PageTitle";
import { Carousel } from "react-bootstrap";
//import GoogleMap from "./GoogleMap/GoogleMap";
//import experts1 from "../../images/experts/expert-1.jpg";
import "./About.css";
import banner7 from '../../Assets/Banner/banner7.png'
// import E from "../Home/E/E";
// import Features from "../Home/Features/Features";
import Footer from './../Shared/Footer/Footer';
import Header from './../Shared/Header/Header';

const About = () => {
  return (
    <div>
      
      <h1 className="about-h1">About Us</h1>
      <div className="d-flex container">
        <PageTitle title="About"></PageTitle>
        <div className="p-5">
          {/* <GoogleMap></GoogleMap> */}
        </div>
        <div className="p-5">
          {/* <img src={banner7} alt="mama"></img> */}
          <Carousel.Caption>
            <p className="mt-3" id="text">
              Our mission is to elevate the quality of life for the urban consumer with unparalleled convenience.
              Convenience is what makes us tick. It's what makes us get out of bed and say, "Let's do this."
            </p>
          </Carousel.Caption>
        </div>
      </div>
      
      
    </div>
    
  );
};

export default About;

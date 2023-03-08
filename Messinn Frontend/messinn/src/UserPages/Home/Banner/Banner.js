import React, { useState } from "react";
import "./Banner.css";
import { Carousel } from "react-bootstrap";
import banner1 from "../../../Assets/Banner/banner1.jpg";
import banner2 from "../../../Assets/Banner/banner2.jpg";
import banner4 from "../../../Assets/Banner/banner4.jpg";

const Banner = () => {
  const [index, setIndex] = useState(0);

  const handleSelect = (selectedIndex, e) => {
    setIndex(selectedIndex);
  };

  return (
    <Carousel fade activeIndex={index} onSelect={handleSelect}>
      <Carousel.Item className="carousel-itemm">
        <img className="d-block w-100 h" src={banner1} alt="First slide" />
        <Carousel.Caption>
          
          <p id="text">
          Good food, good mood.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item className="carousel-itemm">
        <img className="d-block w-100 h" src={banner2} alt="Second slide" />

        <Carousel.Caption>
         
          <p id="text">
          Quality food for quality people.
          </p>
        </Carousel.Caption>
      </Carousel.Item>
      <Carousel.Item className="carousel-itemm">
        <img className="d-block w-100 h" src={banner4} alt="Third slide" />

        <Carousel.Caption>
          
          <p id="text">
          Home-made food that gives you the taste of a restaurant.
          </p>
        
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  );
};

export default Banner;

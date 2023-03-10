import React from 'react';
import logo from "../../../Assets/logo.png";
import './Footer.css';
import FacebookIcon from '@mui/icons-material/Facebook';
import CallIcon from '@mui/icons-material/Call';
import EmailIcon from '@mui/icons-material/Email';
import { Link } from 'react-router-dom';

const Footer = () => {
    const today = new Date();
    const year = today.getFullYear();
    return (
  <footer className="footer-area footer-one " id="footer" >
   <div className="footer-widget">
      <div className="container">
         <div className="row">
            <div className="col-xl-6 col-lg-4 col-sm-12">
               <div className="f-about">
                  <div className="footer-logo">
                     <a href="/">
                     <img src={logo} alt="Logo" />
                     </a>
                  </div>
                  <p className="text">
                  - A Solution for Local Kitchens
                  </p>
               </div>
              
            </div>
            <div className="col-xl-2 col-lg-2 col-sm-4">
               <div className="footer-link">
                  <h6 className="footer-title">About MessInn</h6>
                  <ul>
                     <li><a href="/about">Who We Are</a></li>
                     <li><a href="/">Team</a></li>
                     <li><a href="/">Careers</a></li>
                     <li><a href="/">Work With Us</a></li>
                  </ul>
               </div>
        
            </div>
            <div className="col-xl-2 col-lg-3 col-sm-4">
               <div className="footer-link">
                  <h6 className="footer-title">Contact</h6>
                  <ul>
                     <li><a href="/">Help & Support</a></li>
                     <li><a href="/">Partner With Us</a></li>
                    
                  </ul>
               </div>
         
            </div>
            <div className="col-xl-2 col-lg-3 col-sm-4">
      
               <div className="footer-contact">
                  <h6 className="footer-title">Get In Touch</h6>
                  <ul>
                     <li><Link to='/'><FacebookIcon/>Facebook</Link></li>
                     <li><Link to='/'><CallIcon/>+91 9898989898</Link></li>
                     <li><Link to='/'><EmailIcon/>support@messinn.com</Link></li>
                  </ul>
               </div>
        
            </div>
         </div>
 
      </div>
 
   </div>
 
   <div className="footer-copyright">
      <div className="container">
         <div className="row">
            <div className="col-lg-12">
               <div
                  className="
                  copyright
                  text-center
                  d-md-flex
                  justify-content-between
                  align-items-center
                  "
                  >
                  <p className="text">Copyright © {year} MessInn. All Rights Reserved</p>
                  
               </div>
        
            </div>
         </div>
    
      </div>
   
   </div>

  </footer>

);
};

export default Footer;
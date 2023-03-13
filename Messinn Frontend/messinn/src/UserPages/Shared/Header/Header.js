// import { signOut } from "firebase/auth";
import React from "react";
import {Container, Nav, Navbar } from "react-bootstrap";
// import { useAuthState } from "react-firebase-hooks/auth";
import { Link,} from "react-router-dom";
// import auth from "../../../firebase.init";
import logo from "../../../Assets/logo.png";
import './Header.css';
import HomeIcon from '@mui/icons-material/Home';
import InfoIcon from '@mui/icons-material/Info';
import SearchIcon from '@mui/icons-material/Search';
import ContactsIcon from '@mui/icons-material/Contacts';
import NavDropdown from 'react-bootstrap/NavDropdown';
import { useNavigate } from 'react-router-dom';
import { useState } from 'react';
import { useEffect } from 'react';


import { Button } from 'react-bootstrap';
import axios from "axios";


const Header = () => {
  const navigate=useNavigate();
  const [ad,setAdmin]=useState([]);
  const[loginflag,setLoginflag]=useState(false)

  

  useEffect(()=>{
      axios.get('http://localhost:8080/api/success',{ withCredentials: true })
        // .then(res => res.json())
        .then(res => {setAdmin(res);
          console.log(ad);
         if(res.status===200 && res.data.role==='ROLE_ADMIN'){
          localStorage.setItem("admin",JSON.stringify(res.data))
          setLoginflag(true);
          navigate('/admin')
         }
         else if(res.status===200 && res.data.role==='ROLE_OWNER'){
          localStorage.setItem("owner",JSON.stringify(res.data))
          setLoginflag(true);
          navigate('/owner')
         }
         else if(res.status===200 && res.data.role==='ROLE_CUSTOMER'){
          localStorage.setItem("customer",JSON.stringify(res.data))
          setLoginflag(true);
          navigate('/customer')
         }
         else if(res.status===500){
          navigate('/')
         }
        })
        .catch((err)=>{console.log(err);
          setLoginflag(false);
          navigate('/')
        })
    },[])

    const logout=()=>{
      axios.get('http://localhost:8080/logout',{withCredentials:true})
      .then((res)=>{
        localStorage.clear();
        setLoginflag(false);
        navigate('/')
      })
      .catch(()=>{})
    }
  return (
    <>
      <Navbar
        collapseOnSelect
        expand="lg"
        sticky="top"
        // bg="light"
        // variant="light"
        className="color-nav">
            
        <Container>
          <Navbar.Brand as={Link} to="/" >
            <img  id="pic" src={logo} alt="" />
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link as={Link} to="/">Home<HomeIcon/></Nav.Link>
              <Nav.Link as={Link} to="aboutus">AboutUs<InfoIcon/></Nav.Link>
              <Nav.Link as={Link} to="search">Search<SearchIcon/></Nav.Link>
              <Nav.Link as={Link} to="contact">Contact<ContactsIcon/></Nav.Link>
              {/* <Nav.Link as={Link} to="owner ">Owner</Nav.Link>
              <Nav.Link as={Link} to="admin ">Admin</Nav.Link> */}
            </Nav>
            <Nav>
            
              {loginflag ? (
                <>
                <Nav.Link>Welcome</Nav.Link>
                <Button  className="btn btn-danger rounded-pill" onClick={logout}>
                  Sign out
                </Button></>
              ) : (
                <Nav.Link as={Link} to="/signin">
                  Signin
                </Nav.Link>
                
              )}
              {!ad && (<button className="btn btn-new rounded-pill mx-3">Let's Talk</button>)}
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  );
};

export default Header;

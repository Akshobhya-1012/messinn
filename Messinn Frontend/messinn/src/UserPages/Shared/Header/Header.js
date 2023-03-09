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


const Header = () => {
//   const [user] = useAuthState(auth);
//   const navigate = useNavigate();

  // const handleSignout = () => {
    // signOut(auth);};
  // const handleNavigateC = () =>{
    // navigate(`/contact`);}
  return (
    <>
      <Navbar
        collapseOnSelect
        expand="lg"
        sticky="top"
        // bg="light"
        // variant="light"
        className="color-nav">
            
        <Container fluid>
          <Navbar.Brand as={Link} to="/" >
            <img  id="pic" src={logo} alt="" />
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="responsive-navbar-nav" />
          <Navbar.Collapse id="responsive-navbar-nav">
            <Nav className="me-auto">
              <Nav.Link as={Link} to="/">Home<HomeIcon/></Nav.Link>
                  <NavDropdown title="Signin" >
                    <div id="dropdown">
                    <NavDropdown.Item href="adminsignin">Admin</NavDropdown.Item>
                    <NavDropdown.Item href="ownersignin">Owner</NavDropdown.Item>
                    <NavDropdown.Item href="customersignin">Customer</NavDropdown.Item>
                    </div>
                  </NavDropdown>
              <Nav.Link as={Link} to="aboutus">AboutUs<InfoIcon/></Nav.Link>
              <Nav.Link as={Link} to="search">Search<SearchIcon/></Nav.Link>
              <Nav.Link as={Link} to="contact">Contact<ContactsIcon/></Nav.Link>
              <Nav.Link as={Link} to="admin ">Admin<ContactsIcon/></Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
    </>
  );
};

export default Header;

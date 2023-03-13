import React from "react";
import Sidebar from "./Sidebar/Sidebar"
import Dashboard from "./Dashboard/Dashboard";
import { Link, Route, Routes } from "react-router-dom";

import Signout from './Signout/Signout';
import { Nav } from 'react-bootstrap';
import { Navbar } from 'react-bootstrap';
import Header from './../Shared/Header/Header';
const Admin=()=>{
    return (
        <div class="container-fluid" id="main">
                 <div class="row row-offcanvas row-offcanvas-left">
                   <Sidebar/>
                    <Dashboard/>
                    <Header></Header>
                 

             </div>
             </div>
    )
}
export default Admin;
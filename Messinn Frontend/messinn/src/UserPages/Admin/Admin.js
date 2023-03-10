import React from "react";
import Sidebar from "./Sidebar/Sidebar"
import Dashboard from "./Dashboard/Dashboard";
import { Route, Routes } from "react-router-dom";
import Ownerlist from './../Owner/Ownerlist';
const Admin=()=>{
    return (
        <div class="container-fluid" id="main">
                 <div class="row row-offcanvas row-offcanvas-left">
                   <Sidebar/>
                  <Dashboard/>
                  
             </div>
             </div>
    )
}
export default Admin;
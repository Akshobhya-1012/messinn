import React from 'react'
import Header from '../Shared/Header/Header';
import Dashboard from './Dashboard/Dashboard';
import Sidebar from './Sidebar/Sidebar'


function Owner() {
  return (
    <div className="container-fluid" id="main">
                 <div className="row row-offcanvas row-offcanvas-left">
                    <Sidebar/>
                    <Dashboard/>
                    <Header></Header>
                    
                 </div>
    </div>
  )
}

export default Owner
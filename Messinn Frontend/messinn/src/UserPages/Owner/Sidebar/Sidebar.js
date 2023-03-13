import React from 'react'

import '../Sidebar/Sidebar.css'
const Sidebar = () => {
    return (
         <div className="col-md-3 col-lg-2 sidebar-offcanvas pl-10" id="sidebar" role="navigation" style={{backgroundColor:"#e9ecef"}}>
            <ul className="nav flex-column sticky-top pl-0 pt-5 p-3 mt-3 ">
                <li id="demo" className="nav-item mb-3 mt-3 "><a className="nav-link text-secondary " href="/"><h5>MessInn</h5></a></li>
                <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/admin"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Overview</span></a></li>
                <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/mess"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Mess</span></a></li>
                <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/addmess"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Add Mess</span></a></li>
                <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/edit/:id"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Edit Owner</span></a></li>
                <li className="nav-item mb-2"><a className="nav-link text-secondary" href="/customerlist"><i className="fas fa-file-export font-weight-bold"></i><span className="ml-3">Customers</span></a></li>
                

            </ul>
       </div>
    )
}
 
export default Sidebar
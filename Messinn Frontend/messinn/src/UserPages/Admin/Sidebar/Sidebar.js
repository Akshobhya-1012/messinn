// import React from 'react'

// import '../Sidebar/Sidebar.css'
// const Sidebar = () => {
//     return (
//          <div className="col-md-3 col-lg-2 sidebar-offcanvas pl-10" id="sidebar" role="navigation" style={{backgroundColor:"#e9ecef"}}>
//             <ul className="nav flex-column sticky-top pl-0 pt-5 p-3 mt-3 ">
//                 <li id="demo" className="nav-item mb-3 mt-3 "><a className="nav-link text-secondary " href="/"><h5>MessInn</h5></a></li>
//                 <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/admin"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Overview</span></a></li>
//                 <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/admin"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Analytics</span></a></li>
                
                
//                 <li className="nav-item mb-2"><a className="nav-link text-secondary" href="/customerlist"><i className="fas fa-file-export font-weight-bold"></i><span className="ml-3">Customers</span></a></li>
//                 <li className="nav-item mb-2"><a className="nav-link text-secondary" href="/ownerdetails"><i className="fas fa-tablet-alt font-weight-bold"></i><span className="ml-3">Owner</span></a></li>
                
//                 <li className="nav-item mb-2"><a className="nav-link text-secondary" href="#"><i className="far fa-folder font-weight-bold"></i> <span className="ml-3">Layouts</span></a></li>

//             </ul>
//        </div>
//     )
// }
 
// export default Sidebar

import React from 'react'
const Sidebar = () => {
    return (
         <div className="col-md-3 col-lg-2 sidebar-offcanvas pl-0" id="sidebar" role="navigation" style={{backgroundColor:"#e9ecef"}}>
            <ul className="nav flex-column sticky-top pl-0 pt-5 p-3 mt-3 ">
                <li className="nav-item mb-2 mt-3"><a className="nav-link text-secondary" href="#"><h5>MessInn</h5></a></li>
                <li className="nav-item mb-2 "><a className="nav-link text-secondary" href="/admin"><i className="fas fa-user font-weight-bold"></i> <span className="ml-3">Overview</span></a></li>
                
                <li className="nav-item mb-2"><a className="nav-link text-secondary" href="/ownerdetails"><i className="far fa-chart-bar font-weight-bold"></i> <span className="ml-3">Owners</span></a></li>
                <li className="nav-item mb-2"><a className="nav-link text-secondary" href="/customerlist"><i className="lni lni-users font-weight-bold"></i><span className="ml-3">Customer</span></a></li>
                

            </ul>
       </div>
    )
}
 
export default Sidebar
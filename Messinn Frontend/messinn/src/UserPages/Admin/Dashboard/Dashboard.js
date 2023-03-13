import {useEffect,useState} from 'react';
import PieChart from '../Pie/Piechart';
import config from '../../../config';
import '../Dashboard/Dashboard.css'

 
 
 
// const Dashboard = () => {
   
//    const[record,setRecord] = useState([])
 
//    const getData = () =>
//    {
//        fetch(config.serverURL+'/admin',{method:"GET",credentials:'include'})
//        .then(response=> response.json())
//        .then(res=>setRecord(res))
   
//    }
 
//    useEffect(() => {
//       getData();
//    },[])
    
 
//     return (
//     <div className="col main pt-5 mt-3">
         
        
//         {/* <p className="lead d-none d-sm-block">Add Employee Details and Records</p> */}
 
//         {/* <div className="alert alert-warning fade collapse" role="alert" id="myAlert">
//             <button type="button" className="close" data-dismiss="alert" aria-label="Close">
//                 <span aria-hidden="true">×</span>
//                 <span className="sr-only">Close</span>
//             </button>
//             <strong>Data and Records</strong> Learn more about employee
//         </div> */}
//         <div className="row mb-3" id="demo">
//             <div className="col-xl-3 col-sm-6 py-2">
//                 <div className="card bg-success text-white h-100">
//                     <div className="card-body bg-success" style={{backgroundColor:"#57b960"}}>
//                         <div className="rotate">
//                             <i className="fa fa-user fa-4x"></i>
//                         </div>
//                         <h6 className="text-uppercase">Owners</h6>
//                         <h1 className="display-4">134</h1>
//                     </div>
//                 </div>
//             </div>
//             <div className="col-xl-3 col-sm-6 py-2">
//                 <div className="card text-white bg-danger h-100">
//                     <div className="card-body bg-danger">
//                         <div className="rotate">
//                             <i className="fa fa-list fa-4x"></i>
//                         </div>
//                         <h6 className="text-uppercase">Customers</h6>
//                         <h1 className="display-4">87</h1>
//                     </div>
//                 </div>
//             </div>
//             <div className="col-xl-3 col-sm-6 py-2">
//                 <div className="card text-white bg-info h-100">
//                     <div className="card-body bg-info">
//                         <div className="rotate">
//                           <i className="fab fa-twitter fa-4x"></i>
//                         </div>
//                         <h6 className="text-uppercase">Mess</h6>
//                         <h1 className="display-4">125</h1>
//                     </div>
//                 </div>
//             </div>
//             <div className="col-xl-3 col-sm-6 py-2">
//                 <div className="card text-white bg-warning h-100">
//                     <div className="card-body">
//                         <div className="rotate">
//                             <i className="fa fa-share fa-4x"></i>
//                         </div>
//                         <h6 className="text-uppercase">Dish</h6>
//                         <h1 className="display-4">36</h1>
//                     </div>
//                 </div>
//             </div>
//         </div>
 
//         <hr/>
        
       
//         <div className="row ">
//             <div className="col-lg-7 col-md-6 col-sm-12">
//               <h5>

//               </h5>

//                 <div className="table-responsive">
//                     <table className="table table-striped">
//                         <thead className="thead-light">
//                             <tr>
//                                 <th>No</th>
//                                 <th>Owner Name</th>
//                                 <th>Email</th>
//                                 <th>Mobile No</th>
                               
//                             </tr>
//                         </thead>
//                         <tbody>
//                          {record.slice(0,3).map((output)=>
//                             <tr>
//                                 <td>{output.id}</td>
//                                 <td>{output.name}</td>
//                                 <td>{output.email}</td>
//                                 <td>{output.mob}</td>
                               
//                                 <td></td>
//                             </tr>
//                            )}
//                         </tbody>
//                     </table>
//                 </div>
//             </div>
//             <div className="col-lg-5 col-md-6 col-sm-12 col-sm-offset-5">
//                 <h4 className='title mt-3 mb-3 text-center text-secondary'>Data in Chart</h4>
//                  <div className="mb-5" style={{height:"300px",width:"400px"}}><PieChart/> </div></div>
//         </div>
       
//     </div>
//     )
// }
 
// export default Dashboard
 
const Dashboard = () => {
   
   const[record,setRecord] = useState([])
   const[record1,setRecord1] = useState([])
   const[record2,setRecord2] = useState([])
   const[service,setService] = useState([])
 
   const getData = () =>
   {
       fetch('http://localhost:8080/customer/count',{method:"GET",credentials:'include'})
       .then(resposne=> resposne.json())
       .then(res=>{setRecord(res)
    console.log(res)}
       );
       
   }
   const getData1=()=>{
    fetch('http://localhost:8080/owner/count',{method:"GET",credentials:'include'})
       .then(resposne=> resposne.json())
       .then(res=>{setRecord1(res)
    console.log(res)})
   }
   const getData2=()=>{
    fetch('http://localhost:8080/mess/count',{method:"GET",credentials:'include'})
       .then(resposne=> resposne.json())
       .then(res=>{setRecord2(res)
    console.log(res)})
   }
   
 
   useEffect(() => {
    getData();
    getData1();
    getData2();
      getServices();
    //   getCustomer();
   },[])

   const getServices=()=>{
    fetch('http://localhost:8080/admin',{method:"GET"})
    .then(resposne=> resposne.json())
    .then(res=>setService(res))
   }
    
 
    return (
    <div className="col main pt-5 mt-3">
         
        <div className="row mb-3">
            <div className="col-xl-3 col-sm-6 py-2">
                <div className="card bg-success text-white h-100">
                    <div className="card-body bg-success" style={{backgroundColor:"#57b960"}}>
                        <div className="rotate">
                            <i className="fa fa-user fa-4x"></i>
                        </div>
                        <h6 className="text-uppercase">Customers</h6>
                        <h1 className="display-4">{record}</h1>
                    </div>
                </div>
            </div>
            <div className="col-xl-3 col-sm-6 py-2">
                <div className="card text-white bg-danger h-100">
                    <div className="card-body bg-danger">
                        <div className="rotate">
                            <i className="fa fa-list fa-4x"></i>
                        </div>
                        <h6 className="text-uppercase">Owners</h6>
                        <h1 className="display-4">{record1}</h1>
                    </div>
                </div>
            </div>
            <div className="col-xl-3 col-sm-6 py-2">
                <div className="card text-white bg-warning h-100">
                    <div className="card-body">
                        <div className="rotate">
                            <i className="fa fa-share fa-4x"></i>
                        </div>
                        <h6 className="text-uppercase">Mess</h6>
                        <h1 className="display-4">{record2}</h1>
                    </div>
                </div>
            </div>
            <div className="col-xl-3 col-sm-6 py-2">
                <div className="card text-white bg-info h-100">
                    <div className="card-body bg-info">
                        <div className="rotate">
                          <i className="fab fa-twitter fa-4x"></i>
                        </div>
                        <h6 className="text-uppercase">Tweets</h6>
                        <h1 className="display-4">125</h1>
                    </div>
                </div>
            </div>
           
        </div>
 
        <hr/>
        {/* <div className="row placeholders mb-3">
            <div className="col-6 col-sm-3 placeholder text-center">
                <img src="//placehold.it/200/dddddd/fff?text=1" className="mx-auto img-fluid rounded-circle" alt="Generic placeholder thumbnail"/>
                <h4>Responsive</h4>
                <span className="text-muted">Device agnostic</span>
            </div>
            <div className="col-6 col-sm-3 placeholder text-center">
                <img src="//placehold.it/200/e4e4e4/fff?text=2" className="mx-auto img-fluid rounded-circle" alt="Generic placeholder thumbnail"/>
                <h4>Frontend</h4>
                <span className="text-muted">UI / UX oriented</span>
            </div>
            <div className="col-6 col-sm-3 placeholder text-center">
                <img src="//placehold.it/200/d6d6d6/fff?text=3" className="mx-auto img-fluid rounded-circle" alt="Generic placeholder thumbnail"/>
                <h4>HTML5</h4>
                <span className="text-muted">Standards-based</span>
            </div>
            <div className="col-6 col-sm-3 placeholder text-center">
                <img src="//placehold.it/200/e0e0e0/fff?text=4" className="center-block img-fluid rounded-circle" alt="Generic placeholder thumbnail"/>
                <h4>Framework</h4>
                <span className="text-muted">CSS and JavaScript</span>
            </div>
        </div> */}
       
        <div className="row ">
            <div className="col-lg-7 col-md-6 col-sm-12">
              <h5 className="mt-3 mb-3 text-secondary">
               Owner Details
              </h5>
                <div className="table-responsive">
                    <table className="table table-striped">
                        <thead className="thead-light">
                            <tr>

                                <th>id</th>
                                <th>Email</th>
                                <th>Owner Name</th>
                                <th>Mobile</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                         {service.slice(0,3).map((output)=>
                            <tr>
                                <td>{output.id}</td>
                                <td>{output.email}</td>
                                <td>{output.name}</td>
                                <td>{output.mob}</td>
                                <td></td>
                            </tr>
                           )}
                        </tbody>
                    </table>
                </div>
            </div>
            <div className="col-lg-5 col-md-6 col-sm-12 col-sm-offset-5">
                <h4 className='title mt-3 mb-3 text-center text-secondary'>Data in Chart</h4>
                 <div className="mb-5" style={{height:"300px",width:"400px"}}><PieChart/> </div></div>
        </div>
       
    </div>
    )
}
 
export default Dashboard
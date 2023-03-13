import { Routes, Route,} from 'react-router-dom'
import './App.css'
import Home from './UserPages/Home/Home/Home'

import React from 'react'
import About from './UserPages/AboutPage/About'
import Contact from './UserPages/ContactPage/Contact'




import Header from './UserPages/Shared/Header/Header';
import Search from './UserPages/SearchPage/Search';
import NotFound from './UserPages/Shared/NotFound/NotFound'
import Admin from './UserPages/Admin/Admin';
import Ownerlist from './UserPages/Owner/Ownerlist';
import Customerlist from './UserPages/Customer/Customerlist';
import MessDetails from './UserPages/MessDetails/MessDetails'
import OwnerDetails from './UserPages/Owner/OwnerDetails'
import OwnerEdit from './UserPages/Owner/OwnerEdit';
import AddOwner from './UserPages/Signup/AddOwner';
import Signin from './UserPages/SigninPage/Admin/Signin'
import Owner from './UserPages/Owner/Owner';
import AddMess from './UserPages/Owner/AddMess'

function App() {
  return (
    <div>
      
      <Routes>
      <Route path="/" element={<Home></Home>}></Route>
      <Route path="/signin" element={<Signin></Signin>}></Route>
      {/* <Route path="/ownersignin" element={<OwnerSignin></OwnerSignin>}></Route>
      <Route path="/customersignin" element={<CustomerSignin></CustomerSignin>}></Route> */}
      <Route path="/aboutus" element={<About></About>}></Route>
      <Route path="/search" element={<Search></Search>}></Route>
      <Route path="/contact" element={<Contact></Contact>}></Route>
      <Route path="/admin" element={<Admin></Admin>}></Route>
      <Route path="/ownerlist" element={<Ownerlist></Ownerlist>}></Route>
      <Route path="/customerlist" element={<Customerlist></Customerlist>}></Route>
      <Route path="/mess/getbyid/:messId" element={<MessDetails></MessDetails>}></Route>
      <Route path="/ownerdetails" element={<OwnerDetails></OwnerDetails>}></Route>
      <Route path="/edit/:id" element={<OwnerEdit></OwnerEdit>}></Route>
      <Route path="/addowner" element={<AddOwner></AddOwner>}></Route>
      <Route path="/addmess" element={<AddMess></AddMess>}></Route>
      <Route path="/owner" element={<Owner></Owner>}></Route>
      <Route path="*" element={<NotFound></NotFound>}></Route>
      </Routes>
     
    </div>
  )
}
export default App

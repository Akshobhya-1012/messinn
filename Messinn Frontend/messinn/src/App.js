import { Routes, Route,} from 'react-router-dom'
import './App.css'
import Home from './UserPages/Home/Home/Home'

import React from 'react'
import About from './UserPages/AboutPage/About'
import Contact from './UserPages/ContactPage/Contact'

import AdminSignin from './UserPages/SigninPage/Admin/AdminSignin'
import OwnerSignin from './UserPages/SigninPage/Owner/OwnerSignin'
import CustomerSignin from './UserPages/SigninPage/Customer/CustomerSignin'
import Header from './UserPages/Shared/Header/Header';
import Search from './UserPages/SearchPage/Search';
import Footer from './UserPages/Shared/Footer/Footer'
import NotFound from './UserPages/Shared/NotFound/NotFound'
import Admin from './UserPages/Admin/Admin';
import Ownerlist from './UserPages/Owner/Ownerlist';

function App() {
  return (
    <div>
    <Header></Header>
      <Routes>
      <Route path="/" element={<Home></Home>}></Route>
      <Route path="/adminsignin" element={<AdminSignin></AdminSignin>}></Route>
      <Route path="/ownersignin" element={<OwnerSignin></OwnerSignin>}></Route>
      <Route path="/customersignin" element={<CustomerSignin></CustomerSignin>}></Route>
      <Route path="/aboutus" element={<About></About>}></Route>
      <Route path="/search" element={<Search></Search>}></Route>
      <Route path="/contact" element={<Contact></Contact>}></Route>
      <Route path="/admin" element={<Admin></Admin>}></Route>
      <Route path="/ownerlist" element={<Ownerlist></Ownerlist>}></Route>
      <Route path="/customerlist" element={<Ownerlist></Ownerlist>}></Route>
      <Route path="*" element={<NotFound></NotFound>}></Route>
      </Routes>
     
    </div>
  )
}
export default App

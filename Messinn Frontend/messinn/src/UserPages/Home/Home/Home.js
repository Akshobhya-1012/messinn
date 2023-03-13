import React from 'react'
import Footer from '../../Shared/Footer/Footer';
import Banner from "../Banner/Banner";
import Messes from './../../Messes/Messes';
import Header from './../../Shared/Header/Header';
function Home() {
  return (
    <>
    <Header></Header>
    <Banner></Banner>
    <Messes></Messes>
    <Footer></Footer>
    </>
  )
}

export default Home
import React from 'react'
import Messes from '../Messes/Messes'
import MessSearch from './MessSearch'
import './Search.css'




function Search() {
  return (
    <div class="container">

                    <div className="row height d-flex justify-content-center align-items-center">

                      <div className="col-md-8">

                        <div className="search">
                          <i className="fa fa-search"></i>
                          <input type="text" className="form-control" placeholder="Search for nearby mess"/>
                          <button className="btn btn-primary">Search</button>
                        </div>
                        
                      </div>
                      
                    </div>
                    <MessSearch></MessSearch>
                </div>
  )
}

export default Search

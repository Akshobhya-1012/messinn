import { useEffect, useState } from 'react'
import { Link ,useNavigate} from 'react-router-dom'
import axios from 'axios'
import './Signin.css'


const Signin = () => {

  const navigate=useNavigate();
  const [ad,setAdmin]=useState([]);
  const[loginflag,setLoginflag]=useState(false)

  

  
  return (
    <div  style={{ marginTop: 10}}> 
    <form  id="dem" className="form-signin" method="post" action="http://localhost:8080/login">
        <h2 className="text-center">Sign in</h2>
        <div className='mb-3'>
          <label for="username" class="form-label">Username</label>
          <input type="text" id="username" name="username" class="form-control" placeholder="Username" required autofocus/>
        </div>
        <div className='mb-3'>
          <label for="password" class="form-label">Password</label>
          <input type="password" id="password" name="password" class="form-control" placeholder="Password" required/>
        </div>
        <button  className="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
    </div>
  )
}

const styles = {
  container: {
    width: 400,
    height: 300,
    padding: 20,
    position: 'fixed',
    top: 0,
    left: 0,
    right: 0,
    bottom: 0,
    margin: 'auto',
    borderColor: '#71e1db',
    borderRadius: 18,
    broderWidth: 1,
    borderStyle: 'solid',
    boxShadow: '1px 1px 20px 5px #C9C9C9',
    
  },
  signinButton: {
    position: 'relative',
    width: '100%',
    height: 40,
    backgroundColor: '#71e1db',
    color: 'black',
    borderRadius: 5,
    border: 'none',
    marginTop: 10,
  },
}

export default Signin

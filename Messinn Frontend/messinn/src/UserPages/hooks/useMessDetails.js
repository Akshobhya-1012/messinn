import axios from "axios";
import { useEffect, useState } from "react";
import config from '../../config'

const useMessDetails = messId =>{
    const [mess, setMess] = useState([]);
    useEffect( () =>{
        fetch(`http://localhost:8080/mess/getbyid/${messId}`)
        .then(res => res.json())
        .then(data => setMess(data))
    }, [messId]);
    console.log(mess)
    return [mess]

}
export default useMessDetails;  
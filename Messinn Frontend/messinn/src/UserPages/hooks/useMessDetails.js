import { useEffect, useState } from "react";

const useMessDetails = messId =>{
    const [mess, setMess] = useState([]);

    useEffect( () =>{
        fetch(`http:localhost:8080/mess/${messId}`)
        .then(res => res.json())
        .then(data => setMess(data))
    }, [messId]);
    
    return [mess]

}
export default useMessDetails;
import React, { useEffect, useState } from 'react';
import {API_PATHS} from '../Constants/ApiPaths'; 
import axios from 'axios';

export default function Dashboard() {
    const [tools, setTools] = useState([]);
    useEffect(()=>{
        // const toolsList;
        // console.log(tools);
        axios.get(API_PATHS.BASE_URL + API_PATHS.DASHBOARD_TOOLS).then((res)=>{
            // console.log(res);
            setTools(res.data);
        });
    },[])

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>Dashboard</h1>
      <p>Welcome to the dashboard! Here you can view various statistics and insights.</p>
      <div className="main-view">
        {tools.length && tools.map((tool)=>
        <div key={tool.id} className="tool-card">
            <div className="tool-card-header">
            {tool.name}
            </div>
            <div className="tool-card-descr">
                {tool.description}
            </div>
            </div>
        )}
      </div>
    </div>
  )
}

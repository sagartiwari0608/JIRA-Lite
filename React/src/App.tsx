import { type ReactElement } from 'react'

import './App.css'
import Navbar from './components/Navbar';
// import ApiCall from './components/ApiCall';
import Dashboard from './components/Dashboard';

function App() : ReactElement{
  return (
    <>
    <Navbar/>
    <Dashboard/>
    {/* <ApiCall></ApiCall> */}
    </>
  )
}

export default App

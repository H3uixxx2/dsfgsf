import { BrowserRouter, Route, Routes } from "react-router-dom";
import HomePage from "./components/HomePage/HomePage";
import Courses from "./components/Courses/Courses";
import { Link } from "react-router-dom";
import "./App.scss";
import Login from "./components/Header/Login";
import Register from "./components/Header/Register";
import Header from "./components/Header/Header";
function App() {
  return (
    <div className="app-container">
      <Header />
    </div>
  );
}

export default App;

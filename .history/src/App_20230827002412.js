import { BrowserRouter, Route, Routes } from "react-router-dom";

import { Link } from "react-router-dom";
import "./App.scss";

import Header from "./components/Header/Header";
function App() {
  return (
    <div className="app-container">
      <Header />
    </div>
  );
}

export default App;

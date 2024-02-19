import { Outlet } from "react-router-dom";
import "./App.scss";

import Header from "./components/Header/Header";
function App() {
  return (
    <div className="app-container">
      <div className="header-container"></div>
      <Header />
    </div>
  );
}

export default App;

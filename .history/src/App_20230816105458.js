import { BrowserRouter, Route, Routes } from "react-router-dom";
import HomePage from "./components/HomePage/HomePage";
import Courses from "./components/Courses/Courses";
import "./App.scss";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="courses" element={<Courses />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

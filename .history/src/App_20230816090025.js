import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import HomePage from "./components/HomePage/HomePage";
import Courses from "./components/Courses/Courses";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route index element={<HomePage />}>
            <Route path="/courses" element={<Courses />} />
          </Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;

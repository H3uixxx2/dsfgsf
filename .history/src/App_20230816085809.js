import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import HomePage from "./components/HomePage/HomePage";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<HomePage />}>
            <Route path="blogs" element={<Blogs />} />
          </Route>
        </Routes>
      </Browe>
    </div>
  );
}

export default App;

import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";

function HomePage() {
  return (
    <div className="homepage-container">
      <video width="500px" height="500px" autoPlay loop muted>
        <source src={videoHomePage} type="video/mp4" />
      </video>
    </div>
  );
}

export default HomePage;

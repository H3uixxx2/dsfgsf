import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";

function HomePage() {
  return (
    <div className="homepage-container">
      <video autoPlay muted loop>
        <source src={videoHomePage} type="video/mp4" />
      </video>
      <div className="homepage-content"></div>
    </div>
  );
}

export default HomePage;

import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage";

function HomePage() {
  return (
    <div className="homepage-container">
      <video autoPlay loop playsInline className="">
        <source src="../assets/video-homepage.mp4" type="video/mp4" />
      </video>
    </div>
  );
}

export default HomePage;
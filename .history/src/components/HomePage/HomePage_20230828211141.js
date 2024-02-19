import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";
import background from "../../assets/astronaut.jpg";

function HomePage() {
  return (
    <div className="homepage-container">
      {/* <video autoPlay muted loop>
        <source src={videoHomePage} type="video/mp4" />
      </video> */}
      <img src={background} style={{ zIndex: 0 }} />
      <div className="homepage-content">
        <div className="title-1">
          Invest your cryptocurrency in our platform{" "}
        </div>
        <div className="title-2">
          Greenwich is a platform for buying a cryptocurrency. So, you can start
          your plan to trade or invest in crypto until rising up to the moon.
        </div>
        <div className="title-3">
          <button>Get started. It's free</button>
        </div>
      </div>
    </div>
  );
}

export default HomePage;

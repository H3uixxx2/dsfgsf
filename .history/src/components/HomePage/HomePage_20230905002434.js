import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";
import bitcoinBackground from "../../assets/bitcoin2.mp4";

function HomePage() {
  return (
    <div className="homepage-container">
      <video autoPlay muted loop>
        <source src={videoHomePage} type="video/mp4" />
      </video>
      <div className="homepage-content">
        <div className="title-1">
          <span>Lion</span>
          <span>Domination</span>
          <span>Token</span>
        </div>
        <div className="title-2">
          The effort you invest should yield more than just knowledge
        </div>
        <div className="title-3">
          <button>Get started. It's free</button>
        </div>
      </div>
    </div>
  );
}

export default HomePage;

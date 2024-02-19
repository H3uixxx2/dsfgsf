import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";
import bitcoinBackground from "../../assets/bitcoin2.mp4";
import galaxy from "../../assets/galaxy.jpg";

function HomePage() {
  return (
    <div className="homepage-container">
      {/* <video autoPlay muted loop>
        <source src={videoHomePage} type="video/mp4" />
      </video> */}
      {/* <img src={galaxy} style={{ backgroundSize: "cover" }} /> */}
      <div className="homepage-content">
        <div className="title-1">
          <div>Lion</div>
          <div>Domination</div>
          <div>Token</div>
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

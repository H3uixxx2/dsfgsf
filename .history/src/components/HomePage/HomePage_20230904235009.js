import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";
import bitcoinBackground from "../../assets/bitcoin2.mp4";

function HomePage() {
  return (
    <div className="homepage-container">
      {/* <video autoPlay muted loop>
        <source src={videoHomePage} type="video/mp4" />
      </video> */}
      <section>
        <div class="earth"></div>
      </section>
      <div className="homepage-content">
        <div className="title-1">
          Invest your cryptocurrency in our platform{" "}
        </div>
        <div className="title-2">
          Greenwich is a platform for trading a cryptocurrency. So, you can
          start your plan to trade or invest in crypto until rising up to the
          moon.
        </div>
        <div className="title-3">
          <button>Get started. It's free</button>
        </div>
      </div>
    </div>
  );
}

export default HomePage;

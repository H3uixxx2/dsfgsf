import Header from "../Header/Header";
import "./HomePage.scss";
import videoHomePage from "../../assets/video-homepage.mp4";

function HomePage() {
  return (
    <div className="homepage-container">
      <video autoPlay="autoplay" loop="" width={750} height={500} className="">
        <source src={videoHomePage} type="video/mp4" />
      </video>
    </div>
  );
}

export default HomePage;

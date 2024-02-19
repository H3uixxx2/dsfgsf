// import { useState } from "react";
import "./News.scss";
import newsImg from "../../assets/news-img.jpg"

const News = () => {
  return (
    <div className="news-container">
      <div className="news__heading">
          <h1>News</h1>
          <p>Lion Domination {">"} News</p>
      </div>
      
      <div className="news__content">
        <div className="news__content--left">
          <div className="news-block">
              <img alt="" src={newsImg}/>
            <div className="news-desc">
              <h3>ICO Revolution Investing in Blockchain Solutions for a Decentralized World</h3>
              <p>
              In the ever-evolving landscape of technology and finance, cryptocurrencies have emerged as a revolutionary force, promising to reshape the way we perceive and interact with money. At the heart of this transformation lies the Initial Coin Offering (ICO), a groundbreaking fundraising method that has given birth to countless groundbreaking projects. [...]
              </p>
              <button>READ MORE</button>
            </div>
          </div>
        </div>
        <div className="news__content--right">
          <div className="search">
              <h3>Search</h3>
              <input placeholder="Search..."/>
          </div>
          <div className="recent-posts-wrapper">
            <h3>Recent Posts</h3>
            <div className="recent-post">
              <img alt="" src={newsImg}/>
              <div className="post-desc">
                <span className="time">August 30, 2023</span>
                <p>Crypto Frontier Awaits Join Our ICO To Be At The ...</p>
              </div>
            </div>
            <div className="recent-post">
              <img alt="" src={newsImg}/>
              <div className="post-desc">
                <span className="time">August 30, 2023</span>
                <p>Crypto Frontier Awaits Join Our ICO To Be At The ...</p>
              </div>
            </div>
            <div className="recent-post">
              <img alt="" src={newsImg}/>
              <div className="post-desc">
                <span className="time">August 30, 2023</span>
                <p>Crypto Frontier Awaits Join Our ICO To Be At The ...</p>
              </div>
            </div>
          </div>

          <div className="categories">
            <h3>Categories</h3>
            <p>Blockchain</p>
            <p>Cryptocurrency</p>
            <p>ICO</p>
            <p>Investments</p>
            <p>Tokens</p>
            <p>Trading</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default News;
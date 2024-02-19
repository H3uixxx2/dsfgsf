import Header from "../Header/Header";
import "./HomePage.scss";
import footerImg from "../../assets/logocrypto.png";
import Card from "./Card";
import teamBg from "../../assets/team_bg1.png";
import teamPerson from "../../assets/team_01.png";
import up1 from "../../assets/up_01.png";
import up2 from "../../assets/up_02.png";
import uoBg from "../../assets/uo_bg.png";
import Lottie from "lottie-react";
import animation from "./../../assets/blockchain-animation.json"
import { motion, useScroll } from "framer-motion";
import { useRef } from "react";
import { useFollowPointer } from "./../AboutUs/use-follow-pointer" 

function HomePage() {
  const { scrollYProgress } = useScroll();
  const ref = useRef(null);
  const { x, y } = useFollowPointer(ref);

  return (
    <>
    <motion.div
        className="progress-bar"
        style={{ scaleX: scrollYProgress }}
      />
    <motion.div
      ref={ref}
      className="pointer"
      animate={{ x, y }}
      transition={{
        type: "spring",
        damping: 3,
        stiffness: 50,
        restDelta: 0.001
      }}
    />
    <div className="homepage-container">
      <div className="homepage-content">
        <div className="homepage__left">
        <div className="title-1">
          <div>Lion</div>
          <div>Domination</div>
          <div>Token</div>
        </div>
        <div className="title-2">
          The effort you invest should yield more than just knowledge
        </div>
        <motion.div className="title-3 box"
        whileHover={{ scale: 1.2 }}
        whileTap={{ scale: 0.9 }}
        transition={{ type: "spring", stiffness: 400, damping: 17 }}
        >
          <button>Get started. It's free</button>
        </motion.div>
        </div>
        <div className="homepage__right">
          <Lottie animationData={animation} className="animation"/>
        </div>
      </div>

      {/* Our users option */}
      <div className="our-users">
        <h2>Our Users Options</h2>
        <p>We offer two types of account on the platform</p>
        <div className="options-wrapper">
        <div className="option__column option__column-1">
              <img src={teamBg} alt=""/>
              <div className="options__desc">
                <img src={up1} alt=""/>
                <div className="options__desc-info">
                  <h4>Personal</h4>
                  <ul>
                  <li className="options-heading">Confidentiality</li>  
                    <li className="options-desc">confidentiality involves safeguarding sensitive.</li>  
                    <li className="options-heading">Security</li>  
                    <li className="options-desc">Security is the practice of protecting individuals.</li>  
                    <li className="options-heading">Easy access to personal data</li>  
                    <li className="options-desc">It's essential to be cautious about sharing.</li>  
                    <li className="options-heading">Testing and proactive communication</li>  
                    <li className="options-desc">They are essential components of successful projects.</li>    
                  </ul>                
                </div>
              </div>
          </div>
          <img src={uoBg} className="img-center"/>
          <div className="option__column option__column-2">
              <img src={teamBg} alt=""/>
              <div className="options__desc">
              <img src={up2} alt=""/>
                <div className="options__desc-info">
                  <h4>Commercial</h4>
                  <ul>
                    <li className="options-heading">Automation</li>  
                    <li className="options-desc">Automation refers to the process of using technology.</li>  
                    <li className="options-heading">Compliance with regulations</li>  
                    <li className="options-desc">Compliance with regulations is a critical aspect.</li>  
                    <li className="options-heading">Building a new financial network</li>  
                    <li className="options-desc">Building a new financial network is an ambitious.</li>  
                    <li className="options-heading">Startups for blockchain</li>  
                    <li className="options-desc">Startups in the blockchain industry have been flourishing.</li>  
                  </ul>                
                </div>
              </div>
              
          </div>
        </div>
      </div>
      {/* Our Users Options */}
      <div className="our-team" >
          <h2>Our Dedicated Team</h2>
          <p>Always ready our team to help you</p>
          <div className="teammate-container">
            <div className="teammate__row">
                <img src={teamBg} alt=""/>
                <motion.div className="team-info"  whileHover={{ scale: 1.2 }} whileTap={{ scale: 0.8 }}>
                  <img src={teamPerson} alt=""/>
                  <p>Nguyen Phu Y</p>
                  <span>Front-end Developer</span>
                </motion.div>
            </div>
            <div className="teammate__row">
                <img src={teamBg} alt=""/>
                <motion.div className="team-info"  whileHover={{ scale: 1.2 }} whileTap={{ scale: 0.8 }}>
                  <img src={teamPerson}/>
                  <p>Nguyen Nhat Hao</p>
                  <span>Back-end Developer</span>
                </motion.div>
            </div>
            <div className="teammate__row">
                <img src={teamBg} alt=""/>
                <motion.div className="team-info"  whileHover={{ scale: 1.2 }} whileTap={{ scale: 0.8 }}>
                  <img src={teamPerson}/>
                  <p>Nguyen Tien Dat</p>
                  <span>Blockchain Developer</span>
                </motion.div>
            </div>
            <div className="teammate__row">
                <img src={teamBg} alt=""/>
                <motion.div className="team-info team-info-4"  whileHover={{ scale: 1.2 }} whileTap={{ scale: 0.8 }}>
                  <img src={teamPerson}/>
                  <p>Tran Huynh Anh Hieu</p>
                  <span>Mobile Developer</span>
                </motion.div>
            </div>
          </div>
      </div>

      <footer className="footer">
        <div className="footer__row">
            <div className="footer__column">
                <p>Get regular updates</p>
            </div>
            <div className="footer__column">
                <input placeholder="Enter Your Email Address" type="text"/>
                <button>Subscribe</button>
            </div>
        </div>
        <div className="footer__row-second">
            <motion.div className="footer__column" 
              animate={{ rotate: 180 }}
              transition={{
                repeat: 1,
                repeatType: "reverse",
                duration: 2
              }}
            >
                <img src={footerImg} alt="footer-img"/>
            </motion.div>
            <div className="footer__column">
              <div className="footer__column-1">
                <h4>QUICKLINKS</h4>
                  <ul>
                    <li>Whitepaper</li>
                    <li>One pager</li>
                    <li>Presentation</li>
                    <li>Contact</li>
                  </ul>
              </div>
                <div className="footer__column-1">
                  <h4>OTHERS LINKS</h4>
                  <ul>
                    <li>About</li>
                    <li>API Docs</li>
                    <li>News</li>
                    <li>Team</li>
                  </ul>
                </div>
                <div className="footer__column-1">
                  <h4>LEGAL</h4>
                  <ul>
                    <li>Privacy Policy</li>
                    <li>Terms & Conditions</li>
                    <li>Disclaimer</li>
                    <li>Terms & Use</li>
                  </ul>
                </div>
            </div>
        </div>
        <div className="footer__row-third">
          <div className="copyright">
          Copyright © 2023 Lion Domination. All rights reserved.
          </div>
          <div className="social-media">
          <i class="fa-brands fa-facebook-f"></i>
          <i class="fa-brands fa-instagram"></i>
          <i class="fa-brands fa-linkedin"></i>
          </div>
        </div>
      </footer>
    </div>
    </>
    
  );
}

export default HomePage;

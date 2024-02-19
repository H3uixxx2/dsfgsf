import footerImg from "../../assets/logocrypto.png";
const Footer = () => {
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
            <div className="footer__column">
                <img src={footerImg} alt="footer-img"/>
            </div>
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
}

export default Footer;
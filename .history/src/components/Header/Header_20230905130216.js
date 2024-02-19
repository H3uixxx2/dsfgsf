// import { NavLink } from 'react-bootstrap';
import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import NavDropdown from "react-bootstrap/NavDropdown";
import { NavLink, useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";
import logo from "../../assets/logocrypto.png";
import logo2 from "../../assets/logocrypto2.png";

const Header = () => {
  const navigate = useNavigate();
  const handleLogin = () => {
    navigate("/login");
  };
  const handleSignup = () => {
    navigate("/signup");
  };
  return (
    <Navbar expand="lg" className="bg-body-tertiary navbar-container">
      <Container>
        {/* <NavLink to="/" className="navbar-brand nav-link">
          // {/* <img src={logo} style={{ width: "40px" }} /> }
          Block Chain
        </NavLink> */}
        <nav class="navbar navbar-light bg-light">
          <a class="navbar-brand" href="#">
            <img
              src="/docs/4.0/assets/brand/bootstrap-solid.svg"
              width="30"
              height="30"
              class="d-inline-block align-top"
              alt=""
            />
            Bootstrap
          </a>
        </nav>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <NavLink to="/user" className="nav-link">
              Shop
            </NavLink>
            {/* <NavLink to="/admin" className="nav-link">
              Admin
            </NavLink> */}
            {/* <NavDropdown title="Wallets" id="basic-nav-dropdown">
              <NavDropdown.Item>Crypto Wallet</NavDropdown.Item>
              <NavDropdown.Item>Bitcoin Wallet</NavDropdown.Item>
              <NavDropdown.Item>MetaMask</NavDropdown.Item>
            </NavDropdown> */}
            <NavLink to="/courses" className="nav-link">
              LDT
            </NavLink>
            <NavLink to="/courses" className="nav-link">
              News
            </NavLink>
            <NavLink to="/courses" className="nav-link">
              About us
            </NavLink>
          </Nav>
          <Nav>
            <button className="btn-login">Log in</button>
            <button className="btn-signup">Sign up</button>
            {/* <NavDropdown title="Settings" id="basic-nav-dropdown">
              <NavDropdown.Item>Log in</NavDropdown.Item>
              <NavDropdown.Item>Log out</NavDropdown.Item>
              <NavDropdown.Item>Profile</NavDropdown.Item>
            </NavDropdown> */}
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
};

export default Header;

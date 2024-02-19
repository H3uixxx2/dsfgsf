// import { NavLink } from 'react-bootstrap';
import Container from "react-bootstrap/Container";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import NavDropdown from "react-bootstrap/NavDropdown";
import { NavLink, useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";
import logo from "../../assets/logocrypto.png";
import logo2 from "../../assets/logocrypto2.png";
import "./Header.scss";
import { useState } from "react";

const Header = () => {
  const navigate = useNavigate();
  const handleLogin = () => {
    navigate("/login");
  };
  const handleSignup = () => {
    navigate("/signup");
  };
  const [isActive, setIsActive] = useState(false);

  const handleAddActive = (event) => {
    // 👇️ toggle isActive state on click
    setIsActive((current) => !current);
  };
  return (
    <Navbar expand="lg" className="bg-body-tertiary navbar-container">
      <Container>
        <NavLink className="navbar-light bg-light navbar-brand" to="/">
          <img
            src={logo}
            className="d-inline-block align-top logo-img"
            alt=""
          />
          <p>Lion Domination</p>
        </NavLink>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto navbar-left">
          <NavLink to="/" className="nav-link">
              Home
            </NavLink>
            <NavLink
              to="/store"
              className="nav-link isActive ? 'active' : ''"
              onClick={handleAddActive}
            >
              Store
            </NavLink>
            {/* <NavDropdown title="Wallets" id="basic-nav-dropdown">
              <NavDropdown.Item>Crypto Wallet</NavDropdown.Item>
              <NavDropdown.Item>Bitcoin Wallet</NavDropdown.Item>
              <NavDropdown.Item>MetaMask</NavDropdown.Item>
            </NavDropdown> */}
            <NavLink to="/ldt" className="nav-link">
              LDT
            </NavLink>
            <NavLink to="/news" className="nav-link">
              News
            </NavLink>
            <NavLink to="/aboutUs" className="nav-link">
              About us
            </NavLink>
          </Nav>
          <Nav className="navbar-right">
            <button className="btn-login" onClick={handleLogin}>
              LOGIN
            </button>
            <button className="btn-signup" onClick={handleSignup}>
              SIGNUP
            </button>
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

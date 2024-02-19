import "./Header.scss";
import { useNavigate } from "react-router-dom";

const Header = () => {
  // const isAuthenticated = useSelector(state => state.user.isAuthenticated)
  // const account = useSelector(state => state.user.account)
  const navigate = useNavigate();
  const handleLogin = () => {
    navigate("/login");
  };
  const handleSignup = () => {
    navigate("/signup");
  };
  return (
    <div>
      <nav class="navbar navbar-expand-lg navbar-light bg-light logo-home">
        <div class="container-fluid">
          <a class="navbar-brand" href// import { NavLink } from 'react-bootstrap';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import { NavLink, useNavigate } from "react-router-dom";
import { useSelector } from 'react-redux';

const Header = () => {
  const isAuthenticated = useSelector(state => state.user.isAuthenticated)
  const account = useSelector(state => state.user.account)
  const navigate = useNavigate();
  const handleLogin =()=> {
    navigate("/login")
  }
  const handleSignup = ()=> {
    navigate("/signup")
  }
  return (
    <Navbar expand="lg" className="bg-body-tertiary">
      <Container>
        {/* <Navbar.Brand href="#home">Jason</Navbar.Brand> */}
        <NavLink to='/' className='navbar-brand'>Jason</NavLink>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <NavLink to='/' className='nav-link'>Home</NavLink>
            <NavLink to='/users' className='nav-link'>User</NavLink>
            <NavLink to='/admins' className='nav-link'>Admin</NavLink>
          </Nav>
          <Nav>
            {isAuthenticated === false ?
              <>
                <button className='btn-login' onClick={()=> handleLogin()}>Log in</button>
                  <button className='btn-signup' onClick={()=> handleSignup()}>Sign up</button>
              </>
            :
          <NavDropdown title="Settings" id="basic-nav-dropdown">
              <NavDropdown.Item>Log out</NavDropdown.Item>
              <NavDropdown.Item>Profile</NavDropdown.Item>
          </NavDropdown>
          }
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}

export default Header;="#">
            Greenwich
          </a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <a class="nav-link" href="#">
                  Courses
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  User
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">
                  Admin
                </a>
              </li>
            </ul>
            <div className="btn-action-wrapper">
              <button
                class="btn btn-login btn-primary"
                type="submit"
                onClick={() => handleLogin()}
              >
                Login
              </button>
              <button
                class="btn btn-signup"
                type="submit"
                onClick={() => handleSignup()}
              >
                Sign up
              </button>
            </div>
          </div>
        </div>
      </nav>
    </div>
  );
};

export default Header;

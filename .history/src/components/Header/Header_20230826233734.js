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
          <a class="navbar-brand" href="#">
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

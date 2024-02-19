import { useNavigate } from "react-router-dom";
import coin from "../../assets/coingif.gif";
import "./Login.scss";
import logo from "../../assets/logocrypto.png";


function Login() {
  const navigate = useNavigate();
  const handleSignup = () => {
    navigate("/signup");
  };

  const handleLogin = () => {
    navigate("/");
  };
  return (
    <>
      <section class="vh-100 login-container">
        {/* <div class="container py-5 h-100"> */}
        <div class="row d-flex align-items-center justify-content-center h-100">
          <div class="col-md-8 col-lg-7 col-xl-6 d-flex align-items-center justify-content-center flex-column">
            <img
              src={logo}
              style={{ backgroundSize: "cover", width: "600px", height: "600px"}}
              className="homepage-background img-fluid"
            />
            <h1>Lion Domination Token</h1>
            <h2>Learn to earn</h2>
          </div>
          <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1 vh-100 d-flex align-items-center justify-content-center flex-column left-container">
            {/* <img src={bg} className="bg-img" /> */}
            <h1 class="mb-5">Welcome back!</h1>
            <form className="form-wrapper">
              {/* <!-- Email input --> */}
              <div class="form-outline mb-4">
                <label class="form-label" for="form1Example13">
                  Email address
                </label>
                <input
                  type="email"
                  id="form1Example13"
                  class="form-control form-control-lg"
                />
              </div>

              {/* <!-- Password input --> */}
              <div class="form-outline mb-4">
                <label class="form-label" for="form1Example23">
                  Password
                </label>
                <input
                  type="password"
                  id="form1Example23"
                  class="form-control form-control-lg"
                />
              </div>

              <div class="d-flex justify-content-around align-items-center mb-4">
                {/* <!-- Checkbox --> */}
                <div class="form-check">
                  <input
                    class="form-check-input"
                    type="checkbox"
                    value=""
                    id="form1Example3"
                    checked
                  />
                  <label class="form-check-label" for="form1Example3">
                    {" "}
                    Remember me{" "}
                  </label>
                </div>
                <a href="#!">Forgot password?</a>
              </div>

              {/* <!-- Submit button --> */}
              <div className="login-btn" onClick={handleLogin}>
                <button type="submit" class="btn btn-lg btn-block">
                  Log in
                </button>
              </div>
              <div className="google-btn">
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 512 512"
                  height="24"
                  width="24"
                >
                  <path
                    fill="#4285f4"
                    d="M386 400c45-42 65-112 53-179H260v74h102c-4 24-18 44-38 57z"
                  ></path>
                  <path
                    fill="#34a853"
                    d="M90 341a192 192 0 0 0 296 59l-62-48c-53 35-141 22-171-60z"
                  ></path>
                  <path
                    fill="#fbbc02"
                    d="M153 292c-8-25-8-48 0-73l-63-49c-23 46-30 111 0 171z"
                  ></path>
                  <path
                    fill="#ea4335"
                    d="M153 219c22-69 116-109 179-50l55-54c-78-75-230-72-297 55z"
                  ></path>
                </svg>
                <button type="submit" class="btn btn-lg btn-block">
                  Continue with Google
                </button>
              </div>
              <div className="sign-up-text" onClick={handleSignup}>
                Don't have account? Sign up
              </div>
            </form>
          </div>
        </div>
        {/* </div> */}
      </section>
    </>
  );
}

export default Login;

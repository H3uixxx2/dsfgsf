import { useNavigate } from "react-router-dom";
import coin from "../../assets/coingif.gif";
import "./Login.scss";

function Login() {
  const navigate = useNavigate();
  const handleSignup = () => {
    navigate("/signup");
  };
  return (
    <>
      <section class="vh-100 login-container">
        {/* <div class="container py-5 h-100"> */}
        <div class="row d-flex align-items-center justify-content-center h-100">
          <div class="col-md-8 col-lg-7 col-xl-6 d-flex align-items-center justify-content-center flex-column">
            <img
              src={coin}
              style={{ backgroundSize: "cover" }}
              className="homepage-background img-fluid"
            />
            <h2>Lion Domination Token</h2>
            <h2>Learn to earn</h2>
          </div>
          <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1 vh-100 d-flex align-items-center justify-content-center flex-column input-container">
            <h1 class="mb-5">Welcome back!</h1>
            <form class="w-70">
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
              <button
                type="submit"
                class="btn btn-primary btn-lg btn-block w-100"
              >
                Sign in
              </button>
              <button
                type="submit"
                class="btn btn-primary btn-lg btn-block"
                onClick={handleSignup}
              >
                Sign up
              </button>

              <div class="divider d-flex align-items-center my-4">
                <p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
              </div>

              <a
                className="btn btn-primary btn-lg btn-block"
                style={{ backgroundColor: "#3b5998" }}
                href="#!"
                role="button"
              >
                <i className="fab fa-facebook-f me-2"></i>Continue with Facebook
              </a>
            </form>
          </div>
        </div>
        {/* </div> */}
      </section>
    </>
  );
}

export default Login;

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
      <section class="vh-100">
        <div class="container py-5 h-100">
          <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
              {/* <img
                src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                class="img-fluid"
                alt="Phone image"
              /> */}
              <img
                src={coin}
                style={{ backgroundSize: "cover" }}
                className="homepage-background img-fluid"
              />
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
              <form>
                {/* <!-- Email input --> */}
                <div class="form-outline mb-4">
                  <input
                    type="email"
                    id="form1Example13"
                    class="form-control form-control-lg"
                  />
                  <label class="form-label" for="form1Example13">
                    Email address
                  </label>
                </div>

                {/* <!-- Password input --> */}
                <div class="form-outline mb-4">
                  <input
                    type="password"
                    id="form1Example23"
                    class="form-control form-control-lg"
                  />
                  <label class="form-label" for="form1Example23">
                    Password
                  </label>
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
                <button type="submit" class="btn btn-primary btn-lg btn-block">
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
                  <i className="fab fa-facebook-f me-2"></i>Continue with
                  Facebook
                </a>
                <a
                  className="btn btn-primary btn-lg btn-block"
                  style={{ backgroundColor: "#55acee" }}
                  href="#!"
                  role="button"
                >
                  <i className="fab fa-twitter me-2"></i>Continue with Twitter
                </a>
              </form>
            </div>
          </div>
        </div>
      </section>
    </>
  );
}

export default Login;

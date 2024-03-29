import "./CounterDisplay.scss";

const CounterDisplay = () => {
  return (
    <>
      <section
        class="wow fadeIn animated"
        style="visibility: visible; animation-name: fadeIn;"
      >
        <div class="container">
          <div class="row">
            {/* <!-- counter --> */}
            <div
              class="col-md-3 col-sm-6 bottom-margin text-center counter-section wow fadeInUp sm-margin-bottom-ten animated"
              data-wow-duration="300ms"
              style={{
                visibility: visible,
                animationDuration: "300ms",
                animationName: fadeInUp,
              }}
            >
              <i class="fa fa-beer medium-icon"></i>
              <span id="anim-number-pizza" class="counter-number"></span>
              <span
                class="timer counter alt-font appear"
                data-to="980"
                data-speed="7000"
              >
                2800
              </span>
              <p class="counter-title">Beer Ordered</p>
            </div>
            {/* <!-- end counter --> */}
            {/* <!-- counter --> */}
            <div
              class="col-md-3 col-sm-6 bottom-margin text-center counter-section wow fadeInUp sm-margin-bottom-ten animated"
              data-wow-duration="600ms"
              style={{
                visibility: visible,
                animationDuration: "600ms",
                animationName: fadeInUp,
              }}
            >
              <i class="fa fa-heart medium-icon"></i>
              <span
                class="timer counter alt-font appear"
                data-to="980"
                data-speed="7000"
              >
                980
              </span>
              <span class="counter-title">Happy Clients</span>
            </div>
            {/* <!-- end counter --> */}
            {/* <!-- counter --> */}
            <div
              class="col-md-3 col-sm-6 bottom-margin-small text-center counter-section wow fadeInUp xs-margin-bottom-ten animated"
              data-wow-duration="900ms"
              style={{
                visibility: visible,
                animationDuration: "900ms",
                animationName: fadeInUp,
              }}
            >
              <i class="fa fa-anchor medium-icon"></i>
              <span
                class="timer counter alt-font appear"
                data-to="810"
                data-speed="7000"
              >
                810
              </span>
              <span class="counter-title">Projects Completed</span>
            </div>
            {/* <!-- end counter --> */}
            {/* <!-- counter --> */}
            <div
              class="col-md-3 col-sm-6 text-center counter-section wow fadeInUp animated"
              data-wow-duration="1200ms"
              style="visibility: visible; animation-duration: 1200ms; animation-name: fadeInUp;"
            >
              <i class="fa fa-user medium-icon"></i>
              <span
                class="timer counter alt-font appear"
                data-to="600"
                data-speed="7000"
              >
                600
              </span>
              <span class="counter-title">Clients Served</span>
            </div>
            {/* <!-- end counter --> */}
          </div>
        </div>
      </section>
    </>
  );
};

export default CounterDisplay;

import "./Card.scss";
import image from "https://scontent.fsgn5-11.fna.fbcdn.net/v/t39.30808-6/354248193_1591789207975129_61096347069742372_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=a2f6c7&_nc_ohc=nsUZdsbWB7QAX_yYXKg&_nc_ht=scontent.fsgn5-11.fna&oh=00_AfBieUzmtE1iOigVi1BbzN_b9iWoXeVbVPCNupXeQDJPOQ&oe=64FB9032";

const Card = () => {
  return (
    <>
      <header>
        <div class="container text-center">
          <div class="logo">
            <h1>
              <b>Bootstrap Profile Cards 2019</b>
            </h1>
          </div>

          <h1>Pure CSS Profile Cards with Bootstrap</h1>
        </div>
      </header>

      <div class="container">
        <div class="row">
          <div class="col-md-4">
            <h4 class="text-center">
              <strong>STYLE 1</strong>
            </h4>
            <hr />
            <div class="profile-card-2">
              <img src={image} class="img img-responsive" />
              <div class="profile-name">JOHN DOE</div>
              <div class="profile-username">@johndoesurname</div>
              <div class="profile-icons">
                <a href="#">
                  <i class="fa fa-facebook"></i>
                </a>
                <a href="#">
                  <i class="fa fa-twitter"></i>
                </a>
                <a href="#">
                  <i class="fa fa-linkedin"></i>
                </a>
              </div>
            </div>
          </div>

          <div class="col-md-4">
            <h4 class="text-center">
              <strong>STYLE 2</strong>
            </h4>
            <hr />
            <div class="profile-card-6">
              <img src={image} class="img img-responsive" />
              <div class="profile-name">
                JOHN
                <br />
                DOE
              </div>
              <div class="profile-position">Lorem Ipsum Donor</div>
              <div class="profile-overview">
                <div class="profile-overview">
                  <div class="row text-center">
                    <div class="col-xs-4">
                      <h3>1</h3>
                      <p>Rank</p>
                    </div>
                    <div class="col-xs-4">
                      <h3>50</h3>
                      <p>Matches</p>
                    </div>
                    <div class="col-xs-4">
                      <h3>35</h3>
                      <p>Goals</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <h4 class="text-center">
              <strong>STYLE 3</strong>
            </h4>
            <hr />
            <div class="profile-card-4 text-center">
              <img src={image} class="img img-responsive" />
              <div class="profile-content">
                <div class="profile-name">
                  John Doe
                  <p>@johndoedesigner</p>
                </div>
                <div class="profile-description">
                  Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
                  diam nonumy eirmod tempor.
                </div>
                <div class="row">
                  <div class="col-xs-4">
                    <div class="profile-overview">
                      <p>TWEETS</p>
                      <h4>1300</h4>
                    </div>
                  </div>
                  <div class="col-xs-4">
                    <div class="profile-overview">
                      <p>FOLLOWERS</p>
                      <h4>250</h4>
                    </div>
                  </div>
                  <div class="col-xs-4">
                    <div class="profile-overview">
                      <p>FOLLOWING</p>
                      <h4>168</h4>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Card;

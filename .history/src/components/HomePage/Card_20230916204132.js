import "./Card.scss";
import card1 from "../../assets/card1.jpg";
import card2 from "../../assets/card2.jpg";
import card3 from "../../assets/card3.jpg";

const Card = () => {
  return (
    <>
      <div class="container">
        <div class="row">
          <div class="col-md-4">
            <hr />
            <div class="profile-card-2">
              <img src={card1} class="img img-responsive" />
              <div class="profile-name">Jason Nguyen</div>
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
            <hr />
            <div class="profile-card-6">
              <img
                src={card2}
                class="img img-responsive"
                style={{ width: "150px", height: "150px" }}
              />
              <div class="profile-name">
                Jason
                <br />
                Nguyen
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
            <hr />
            <div class="profile-card-4 text-center">
              <img src={card3} class="img img-responsive" />
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default Card;

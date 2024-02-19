import "./Store.scss";
import bg1 from "../../assets/courses-bg.png";
import bg2 from "../../assets/gift-bg.png";
const Store = () => {
  return (
    <div className="store-container d-flex justify-content-between">
      <div className="store-left">
        <div className="row height d-flex align-items-center search-wrapper">
          <div className="col-md-8">
            <div className="search">
              <i className="fa fa-search"></i>
              <input
                type="text"
                className="form-control"
                placeholder="Have a question? Ask Now"
              />
              <button className="btn btn-primary">Search</button>
            </div>
          </div>
        </div>
        <div className="store-features">
          <div>
            <img src={bg1} />
          </div>
          <div>
            <img src={bg2} />
          </div>
          <div>item 3</div>
        </div>
      </div>
      <div className="store-right">this is right</div>
    </div>
  );
};

export default Store;

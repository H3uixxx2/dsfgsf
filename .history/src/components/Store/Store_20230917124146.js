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
          <div className="store-features__item">
            <img src={bg1} className="store-features__img" />
            <span className="store-features__desc">COURSEs</span>
          </div>
          <div className="store-features__item">
            <img src={bg2} className="store-features__img" />
            <span className="store-features__desc gifts">GIFTs</span>
          </div>
          <div className="store-features__item">
            <img src={bg2} className="store-features__img" />
            <span className="store-features__desc gifts">GIFTs</span>
          </div>
        </div>
      </div>
      <div className="store-right">this is right</div>
    </div>
  );
};

export default Store;

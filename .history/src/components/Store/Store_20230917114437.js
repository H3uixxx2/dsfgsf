import "./Store.scss";
const Store = () => {
  return (
    <div className="store-container d-flex justify-content-between">
      <div className="store-left">
        <div className="row height d-flex justify-content-center align-items-center">
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
      </div>
      <div className="store-right">this is right</div>
    </div>
  );
};

export default Store;

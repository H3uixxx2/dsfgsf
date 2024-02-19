import "./Store.scss";
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
              {/* <button className="btn btn-primary">Search</button> */}
              <span class="input-group-text border-0" id="search-addon">
                <i class="fas fa-search"></i>
              </span>
            </div>
          </div>
        </div>
      </div>
      <div className="store-right">this is right</div>
    </div>
  );
};

export default Store;

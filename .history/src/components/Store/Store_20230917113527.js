import "./Store.scss";
const Store = () => {
  return (
    <div className="store-container d-flex justify-content-between">
      <div className="store-left">
        <div class="container">
          <div class="row height d-flex justify-content-center align-items-center">
            <div class="col-md-8">
              <div class="search">
                <i class="fa fa-search"></i>
                <input
                  type="text"
                  class="form-control"
                  placeholder="Have a question? Ask Now"
                />
                <button class="btn btn-primary">Search</button>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div className="store-right">this is right</div>
    </div>
  );
};

export default Store;

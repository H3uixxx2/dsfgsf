import "./Store.scss";
const Store = () => {
  return (
    <div className="store-container d-flex justify-content-between">
      <div className="store-left">
        <div class="row">
          <div class="span12">
            <form
              id="custom-search-form"
              class="form-search form-horizontal pull-right"
            >
              <div class="input-append span12">
                <input type="text" class="search-query" placeholder="Search" />
                <button type="submit" class="btn">
                  <i class="icon-search"></i>
                </button>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div className="store-right">this is right</div>
    </div>
  );
};

export default Store;

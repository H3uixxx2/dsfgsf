import { useState } from "react";
import "./DashBoard.scss";
import React from "react";
import Chart from "chart.js/auto";
import { Pie, Line, Bar,Doughnut } from "react-chartjs-2";
import { Tab, initMDB } from "mdb-ui-kit";
const labels = ["January", "February", "March", "April", "May", "June"];
const data = {
  labels: labels,
  datasets: [
    {
      label: "My First dataset",
      backgroundColor: "rgba(18, 200, 150, 0.6)",
      borderColor: "rgba(18, 200, 150, 0.6)",
      data: [0, 10, 5, 2, 20, 30, 45],
    },
  ],
};

const DashBoard = (props) => {
  initMDB({ Tab });
  return (
    <div className="dashboard-container">
      <div className="row dashboard-row">
        <div className="col-3 dashboard-col">
          <Pie data={data} />
        </div>
        <div className="col-3 dashboard-col">
          <Line data={data} />
        </div>
        <div className="col-3 dashboard-col">
          <Bar data={data} />
        </div>
        <div className="col-3 dashboard-col">
          <Doughnut data={data} />
        </div>
      </div>
      <div className="row portfolio-row">
        <div className="col-6 portfolio-col">
          <h4>Your Portfolio Balance</h4>
          <p className="money">$ 179,626</p>
          <p className="overall">Overall balance</p>
          <button type="button" class="btn btn-success">Deposit</button>
          <button type="button" class="btn btn-primary">Withdraw</button>
          <button type="button" class="btn btn-secondary">Add new wallet</button>
        </div>
        <div className="col-6 portfolio-col">
          <h4>Balance History</h4>
          <Line data={data} />
        </div>
      </div>
      <div className="row account-container">
        <div className="col-6 account-col">
          <div className="about-account d-flex justify-content-between">
            <h4>Send Money To</h4>
            <button type="button" class="btn btn-info">Add New Account</button>
          </div>
          <table className="table-users table">
          <thead>
            <tr>
              <th scope="col">Account Holder Name</th>
              <th scope="col">Last Transfer</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th scope="row">Jeniffer L.</th>
              <td>2 hrs. ago</td>
              <td>Pay</td>
            </tr>
            <tr>
              <th scope="row">Jim Green</th>
              <td>1 month ago</td>
              <td>Pay</td>
            </tr>
            <tr>
              <th scope="row">Joe Black</th>
              <td>1 month ago</td>
              <td>Pay</td>
            </tr>
          </tbody>
          </table>
        </div>
        <div className="col-6 currency-col">
          <h4>Currency Calculator</h4>
          <p className="currency-BTC">1.87 BTC equals</p>
          <p className="currency-USD">11466.78 USD</p>
          <p className="currency-approximately">1 BTC ≈ 6718.72 USD</p>
          <div className="from-to-amount d-flex">
            <div class="btn-group">
              <button type="button" class="btn btn-light dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                From
              </button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <a class="dropdown-item" href="#">Something else here</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Separated link</a>
              </div>
            </div>
            <div class="btn-group">
              <button type="button" class="btn btn-light dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                To
              </button>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Action</a>
                <a class="dropdown-item" href="#">Another action</a>
                <a class="dropdown-item" href="#">Something else here</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Separated link</a>
              </div>
            </div>
            <div class="input-group mb-3 result-btn">
            <div class="input-group-prepend">
              <span class="input-group-text">$</span>
            </div>
            <input type="text" class="form-control" aria-label="Amount to (BTC)"/>
            <div class="input-group-append">
              <span class="input-group-text">.00</span>
            </div>
          </div>
          </div>
          <button type="button" class="btn btn-success btn-transfer">Transfer Now</button>
        </div>
      </div>
      {/* tabs */}
      <div className="row social-media-row">
        
        <div className="col-6 social-media-col">
        <h4>Crypto News</h4>
          <ul class="nav nav-tabs mb-3" id="ex1" role="tablist">
            <li class="nav-item" role="presentation">
              <a
                data-mdb-tab-init
                class="nav-link active"
                id="ex1-tab-1"
                href="#ex1-tabs-1"
                role="tab"
                aria-controls="ex1-tabs-1"
                aria-selected="true"
                >All</a
              >
            </li>
            <li class="nav-item" role="presentation">
              <a
                data-mdb-tab-init
                class="nav-link"
                id="ex1-tab-2"
                href="#ex1-tabs-2"
                role="tab"
                aria-controls="ex1-tabs-2"
                aria-selected="false"
                >Bitcoin</a
              >
            </li>
            <li class="nav-item" role="presentation">
              <a
                data-mdb-tab-init
                class="nav-link"
                id="ex1-tab-3"
                href="#ex1-tabs-3"
                role="tab"
                aria-controls="ex1-tabs-3"
                aria-selected="false"
                >Ripple</a
              >
            </li>
            <li class="nav-item" role="presentation">
              <a
                data-mdb-tab-init
                class="nav-link"
                id="ex1-tab-3"
                href="#ex1-tabs-3"
                role="tab"
                aria-controls="ex1-tabs-4"
                aria-selected="false"
                >Litecoin</a
              >
            </li>
          </ul>

          <div class="tab-content" id="ex1-content">
            <div
              class="tab-pane fade show active"
              id="ex1-tabs-1"
              role="tabpanel"
              aria-labelledby="ex1-tab-1"
            >
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/bitcoin.jpg" alt=""  style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/blockchain.jpg" alt="" style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/bitcoin-mousetrap.jpg" alt="" style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
            </div>
            <div class="tab-pane fade" id="ex1-tabs-2" role="tabpanel" aria-labelledby="ex1-tab-2">
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/bitcoin.jpg" alt=""  style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/blockchain.jpg" alt="" style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/bitcoin-mousetrap.jpg" alt="" style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
            </div>
            <div class="tab-pane fade" id="ex1-tabs-3" role="tabpanel" aria-labelledby="ex1-tab-3">
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/bitcoin.jpg" alt=""  style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/blockchain.jpg" alt="" style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
              <div className="tab-content-1 d-flex">
                <img className="img-thumbnail" src="https://wieldy.g-axon.work/assets/images/dashboard/bitcoin-mousetrap.jpg" alt="" style={{width: "150px", height: "130px", marginRight: "10px"}}/>
                <div className="title">
                  <h1 className="h4">10 things you must know before trading in cryptocurrency</h1>
                  <p>Cras tincidunt sit amet massa at accumsan. Mauris tincidunt tincidunt est, et pulvinar felis pharetra in vestibulum sed.</p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div className="col-6">
          <div className="download-container d-flex justify-content-between">
              <div className="download-left">
                <h4>Download Mobile Apps</h4>
                <p>Now, your account is on your fingers</p>
              </div>
              <div className="download-right  d-flex flex-column">
                <img src="https://wieldy.g-axon.work/assets/images/dashboard/google.png"/>
                <img src="https://wieldy.g-axon.work/assets/images/dashboard/apple.png"/>
              </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default DashBoard;

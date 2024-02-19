import "./Wallet.scss"

const Wallet = () => {
    return (
        <div className="container-fluid">
            <h1>Wallets</h1>
            <h2>Card Details</h2>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <h3>Card Name</h3>
                        <p>Main Balance</p>
                    </div>
                    <div class="col">
                        <h3>Bank Name</h3>
                        <p>ABC Center Bank</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <h3>Valid Date</h3>
                        <p>08/21</p>
                    </div>
                    <div class="col">
                        <h3>Card Holder</h3>
                        <p>Marquezz Silalahi</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <h3>Card Number</h3>
                        <p>**** **** **** 1234</p>
                    </div>
                    <div class="col">
                        <h3>Card Theme</h3>
                        <p>Marquezz Silalahi</p>
                    </div>
                </div>
                
            </div>
        </div>
    )
}

export default Wallet
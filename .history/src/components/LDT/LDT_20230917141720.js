import "./LDT.scss";
import coin from "../../assets/coingif.gif";

const LDT = () => {
  return (
    <div className="ldt-container">
      <div className="ldt-left">
        <img src={coin} />
        <div>Lion Domination Token</div>
        <div>The effort you invest should yield more than just knowledge</div>
      </div>
      <div className="ldt-right">right</div>
    </div>
  );
};

export default LDT;

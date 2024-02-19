import "./LDT.scss";
import coin from "../../assets/logocrypto.png";

const LDT = () => {
  return (
    <div className="ldt-container">
      <div className="ldt-left">
        <img src={coin} className="ldt__img" />
        <div className="ldt__title">
          <div>Lion</div>
          <div>Domination</div>
          <div>Token</div>
        </div>
        <div className="ldt__desc">
          The effort you invest should yield more than just knowledge
        </div>
      </div>
      <div className="ldt-right">
        <span>
          Lion Domination Token (LDT) is a blockchain-based project that aims to
          revolutionize the way people learn. LDT is a learn-to-earn token that
          rewards students for completing tasks. Students can earn LDT by taking
          courses, completing quizzes, and participating in other activities.
        </span>
        <span>
          LDT tokens can be used to purchase goods and services in the LDT
          Store. The LDT Store offers a variety of items, including courses,
          merchandise, and NFTs. LDT tokens can also be used to trade on
          cryptocurrency exchanges.
        </span>
        <span>
          The total supply of LDT tokens is 10 million. LDT tokens are written
          in Solidity and run on the Binance Smart Chain (BSC).
        </span>
        <span>How does LDT work?</span>
        <span>
          LDT tokens are awarded to students based on their performance in a
          variety of tasks. These tasks can include:
          <ul>
            <li>Taking courses</li>
            <li>Completing quizzes</li>
            <li>Participating in discussions</li>
            <li>Creating content</li>
          </ul>
        </span>
        The amount of LDT awarded for each task varies depending on the
        difficulty of the task and the student's performance. Benefits of LDT
        LDT offers a number of benefits to students, including: Financial
        rewards for learning Increased motivation to learn Access to a wider
        range of educational resources A sense of community and engagement
        Conclusion LDT is a new and innovative way to learn. By rewarding
        students for their efforts, LDT helps to create a more engaging and
        rewarding learning experience. Here are some additional details about
        LDT: LDT is a BEP-20 token on the Binance Smart Chain (BSC). The LDT
        contract is fully audited and secure. LDT is backed by a strong team of
        experienced developers and entrepreneurs. We are excited to see how LDT
        will revolutionize the way people learn.
      </div>
    </div>
  );
};

export default LDT;

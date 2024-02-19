import "./Store.scss";
import bg1 from "../../assets/courses-bg.png";
import bg2 from "../../assets/gift-bg.png";
import rm from "../../assets/rm_bg1.png";
import faq from "../../assets/faq_bg.png";
import course from "../../assets/course-item.jpg";
// gift
import gift1 from "../../assets/gift_01.png";
import gift2 from "../../assets/gift_02.png";
import gift3 from "../../assets/gift_03.png";
import gift4 from "../../assets/gift_04.png";
import gift5 from "../../assets/gift_05.png";
// nft
import nft1 from "../../assets/nft_01.png";
import nft2 from "../../assets/nft_02.png";
import nft3 from "../../assets/nft_03.png";
import nft4 from "../../assets/nft_04.png";
import nft5 from "../../assets/nft_05.png";
import nft6 from "../../assets/nft_06.png";
import nft7 from "../../assets/nft_07.png";
import nft8 from "../../assets/nft_08.png";



import { useState } from "react";
const Store = () => {
  const [itemVisible, setItemVisible] = useState(false);
  const [isActive, setIsActive] = useState(false);

  const [activeFeature, setActiveFeature] = useState(null);

  const handleAddActive = (feature) => {
    setActiveFeature(feature);
  };

  const renderRightContent = () => {
    switch (activeFeature) {
      case 'courses':
        return <div>
          <img src={faq}/>
        <div className="store-courses-wrapper">
          <div className="store-courses-col1">
            <img src={course} className="store-course__img" />
            <img src={course} className="store-course__img" />
            <img src={course} className="store-course__img" />
          </div>
          <div className="store-courses-col2">
            <img src={course} className="store-course__img" />
            <img src={course} className="store-course__img" />
            <img src={course} className="store-course__img" />
          </div>
          <div className="store-courses-col3">
            <img src={course} className="store-course__img" />
            <img src={course} className="store-course__img" />
            <img src={course} className="store-course__img" />
          </div>
        </div>
        </div>;
      case 'gifts':
        return <div>
          <img src={faq}/>
        <div className="store-courses-wrapper">
          <div className="store-courses-col1">
            <img src={gift1} className="store-course__img" />
            <img src={gift2} className="store-course__img" />
            <img src={gift3} className="store-course__img" />
          </div>
          <div className="store-courses-col2">
            <img src={gift4} className="store-course__img" />
            <img src={gift5} className="store-course__img" />
            <img src={gift1} className="store-course__img" />
          </div>
          <div className="store-courses-col3">
            <img src={gift2} className="store-course__img" />
            <img src={gift3} className="store-course__img" />
            <img src={gift5} className="store-course__img" />
          </div>
        </div>
        </div>;
      case 'nfts':
        return <div>
          <img src={faq}/>
        <div className="store-courses-wrapper">
          <div className="store-courses-col1">
            <img src={nft1} className="store-course__img" />
            <img src={nft2} className="store-course__img" />
            <img src={nft3} className="store-course__img" />
          </div>
          <div className="store-courses-col2">
            <img src={nft4} className="store-course__img" />
            <img src={nft5} className="store-course__img" />
            <img src={nft6} className="store-course__img" />
          </div>
          <div className="store-courses-col3">
            <img src={nft7} className="store-course__img" />
            <img src={nft8} className="store-course__img" />
            <img src={nft2} className="store-course__img" />
          </div>
        </div>
        </div>;
      default:
        return <div>
                <img src={faq}/>
              <div className="store-courses-wrapper">
                <div className="store-courses-col1">
                  <img src={course} className="store-course__img" />
                  <img src={course} className="store-course__img" />
                  <img src={course} className="store-course__img" />
                </div>
                <div className="store-courses-col2">
                  <img src={course} className="store-course__img" />
                  <img src={course} className="store-course__img" />
                  <img src={course} className="store-course__img" />
                </div>
                <div className="store-courses-col3">
                  <img src={course} className="store-course__img" />
                  <img src={course} className="store-course__img" />
                  <img src={course} className="store-course__img" />
                </div>
              </div>
      </div>;
    }
  };
  return (
    <div className="store-container d-flex justify-content-center">
      <div className="store-left">
        <div className="store-features">
        <div className="store-features__item">
          <img src={rm} className="store-features__img" />
          <span
            className={`store-features__desc course ${activeFeature === 'courses' ? 'active' : ''}`}
            onClick={() => handleAddActive('courses')}
          >
            COURSEs
          </span>
        </div>
        <div className="store-features__item item-2">
          <img src={rm} className="store-features__img" />
          <span
            className={`store-features__desc gifts ${activeFeature === 'gifts' ? 'active' : ''}`}
            onClick={() => handleAddActive('gifts')}
          >
            GIFTs
          </span>
        </div>
        <div className="store-features__item item-3">
          <img src={rm} className="store-features__img" />
          <span
            className={`store-features__desc gifts ${activeFeature === 'nfts' ? 'active' : ''}`}
            onClick={() => handleAddActive('nfts')}
          >
            NFTs
          </span>
        </div>
        </div>
      </div>
      <div className="store-right">
      {renderRightContent()}
      </div>
    </div>
  );
};

export default Store;

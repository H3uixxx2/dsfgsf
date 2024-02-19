import SideBar from "./SideBar";
import "./User.scss";
import { FaBars } from "react-icons/fa";
import { useState } from "react";
import { Outlet } from "react-router-dom";
const User = (props) => {
  const [collapsed, setCollapsed] = useState(false);

  return (
    <div className="user-container">
      <div className="user-sidebar">
        <SideBar collapsed={collapsed} />
      </div>
      <div className="user-content">
        <div className="user-header">
          <FaBars onClick={() => setCollapsed(!collapsed)} />
        </div>
        <div className="user-main">
          <Outlet />
        </div>
      </div>
    </div>
  );
};
export default User;

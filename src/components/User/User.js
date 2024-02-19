import SideBar from "./SideBar";
import "./User.scss";
import { FaBars } from "react-icons/fa";
import { useState } from "react";
import { Outlet } from "react-router-dom";
const User = (props) => {
  const [collapsed, setCollapsed] = useState(false);

  return <div className="user-container"></div>;
};
export default User;

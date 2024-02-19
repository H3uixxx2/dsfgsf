import "react-pro-sidebar/dist/css/styles.css";
import {
  ProSidebar,
  Menu,
  MenuItem,
  SubMenu,
  SidebarHeader,
  SidebarFooter,
  SidebarContent,
} from "react-pro-sidebar";

import {
  FaTachometerAlt,
  FaGem,
  FaList,
  FaGithub,
  FaRegLaughWink,
  FaHeart,
} from "react-icons/fa";

import { NavLink, useNavigate } from "react-router-dom";
import logo from "../../assets/logocrypto.png";
import { Sidebar } from "react-pro-sidebar";
import { Link } from "react-router-dom";
import sidebarBg from "../../assets/bg2.jpg";

const SideBar = (props) => {
  const { image, collapsed, toggled, handleToggleSidebar } = props;
  return (
    <>
      <Sidebar>
        <Menu
          menuItemStyles={{
            button: {
              // the active class will be added automatically by react router
              // so we can use it to style the active menu item
              [`&.active`]: {
                backgroundColor: "#13395e",
                color: "#b6c8d9",
              },
            },
          }}
        >
          <MenuItem component={<Link to="/documentation" />}>
            {" "}
            Documentation
          </MenuItem>
          <MenuItem component={<Link to="/calendar" />}> Calendar</MenuItem>
          <MenuItem component={<Link to="/e-commerce" />}> E-commerce</MenuItem>
        </Menu>
      </Sidebar>
      ;
    </>
  );
};

export default SideBar;

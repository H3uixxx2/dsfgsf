import "react-pro-sidebar/dist/css/styles.css";
import "./SideBar.scss";
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
import sidebarBg from "../../assets/bg2.jpg";

const SideBar = (props) => {
  const { image, collapsed, toggled, handleToggleSidebar } = props;
  return (
    <>
      <ProSidebar
        image={sidebarBg}
        collapsed={collapsed}
        toggled={toggled}
        breakPoint="md"
        onToggle={handleToggleSidebar}
      >
        <SidebarHeader className="sidebar-header-wrapper">
          {/* <div
            style={{
              padding: "24px",
              textTransform: "uppercase",
              fontWeight: "bold",
              fontSize: 14,
              letterSpacing: "1px",
              overflow: "hidden",
              textOverflow: "ellipsis",
              whiteSpace: "nowrap",
            }}
          >
            Lion Domination
          </div> */}
          <NavLink
            class="navbar-light navbar-brand nav-link"
            to="/"
            style={{
              padding: "24px",
              textTransform: "uppercase",
              fontWeight: "bold",
              fontSize: 14,
              letterSpacing: "1px",
              overflow: "hidden",
              textOverflow: "ellipsis",
              whiteSpace: "nowrap",
              color: "white",
            }}
          >
            <img
              src={logo}
              class="d-inline-block align-top logo-img"
              alt=""
              style={{ width: "40px", height: "40px", margin: "14px 0 14px 0" }}
            />
          </NavLink>
          <span>Lion Domination</span>
        </SidebarHeader>

        <SidebarContent>
          <Menu iconShape="circle">
            <MenuItem
              icon={<FaTachometerAlt />}
              suffix={<span className="badge red">New</span>}
            >
              Dashboard
            </MenuItem>
            <MenuItem icon={<FaGem />}> Components </MenuItem>
          </Menu>
          <Menu iconShape="circle">
            <SubMenu
              suffix={<span className="badge yellow">3</span>}
              icon={<FaRegLaughWink />}
              title="Features"
            >
              <MenuItem>Manage User</MenuItem>
              <MenuItem>Manage ...</MenuItem>
              <MenuItem>Manage ...</MenuItem>
            </SubMenu>
          </Menu>
        </SidebarContent>

        <SidebarFooter style={{ textAlign: "center" }}>
          <div
            className="sidebar-btn-wrapper"
            style={{
              padding: "20px 24px",
            }}
          >
            <a
              href="https://github.com/azouaoui-med/react-pro-sidebar"
              target="_blank"
              className="sidebar-btn"
              rel="noopener noreferrer"
            >
              <FaGithub />
              <span
                style={{
                  whiteSpace: "nowrap",
                  textOverflow: "ellipsis",
                  overflow: "hidden",
                }}
              >
                viewSource
              </span>
            </a>
          </div>
        </SidebarFooter>
      </ProSidebar>
    </>
  );
};

export default SideBar;

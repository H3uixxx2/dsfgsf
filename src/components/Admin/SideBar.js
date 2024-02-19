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
  FaChartBar,
  FaHome,
  FaPersonBooth,
} from "react-icons/fa";

import { MdOutlineFeaturedVideo } from "react-icons/md";
import { IoPerson } from "react-icons/io5";
import { CgLogIn } from "react-icons/cg";
import { Link } from "react-router-dom";
import { CgLogOut } from "react-icons/cg";
import { NavLink, useNavigate } from "react-router-dom";
import logo from "../../assets/logocrypto.png";
import sidebarBg from "../../assets/bg2.jpg";

const SideBar = (props) => {
  const { image, collapsed, toggled, handleToggleSidebar } = props;
  return (
    <>
      <ProSidebar
        // image={sidebarBg}
        collapsed={collapsed}
        toggled={toggled}
        breakPoint="md"
        onToggle={handleToggleSidebar}
        className="sidebar-wrapper"
      >
        <SidebarHeader className="sidebar-header-wrapper">
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
        </SidebarHeader>

        <SidebarContent>
          <Menu iconShape="circle">
            <SubMenu
              suffix={<span className="badge yellow">6</span>}
              icon={<MdOutlineFeaturedVideo />}
              title="Dashboard"
              className="dashboard"
            >
              <MenuItem>
                Wallet
                {/* <Link to="/admin/manage-users" /> */}
              </MenuItem>
              <MenuItem>
                Transactions
                {/* <Link to="/admin/manage-users" /> */}
              </MenuItem>
              <MenuItem>
                Market Capital
                {/* <Link to="/admin/manage-users" /> */}
              </MenuItem>
            </SubMenu>
          </Menu>
          <Menu iconShape="circle">
            <SubMenu
              suffix={<span className="badge yellow">2</span>}
              icon={<MdOutlineFeaturedVideo />}
              title="Account Pages"
            >
              <MenuItem>
                Manage User
                <Link to="/admin/manage-users" />
              </MenuItem>
              <MenuItem icon={<IoPerson />}>Profile</MenuItem>
              <MenuItem icon={<CgLogOut />}>Log out</MenuItem>
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
              href="https://www.facebook.com/ynguyen0101/"
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
                My Profile
              </span>
            </a>
          </div>
        </SidebarFooter>
      </ProSidebar>
    </>
  );
};

export default SideBar;

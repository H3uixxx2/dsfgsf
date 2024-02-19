import ModalCreateUser from "./ModalCreateUser";
import "./ManageUser.scss";
import { FaPlus } from "react-icons/fa";
import { useState } from "react";


const ManageUser = (props) => {
  const [showModalCreateUser, setShowModalCreateUser] = useState(false)


  return (
    <div className="manage-user-container">
      <div className="title">Manage User</div>
      <div className="users-content">
        <div className="btn-add-new">
          <button className="btn btn-success" onClick={()=>setShowModalCreateUser(true)}><FaPlus/> Add new user</button>
        </div>
        <div className="table-users">table users</div>
        <ModalCreateUser 
        show={showModalCreateUser} 
        setShow={setShowModalCreateUser}
        />
      </div>
    </div>
  );
};

export default ManageUser;

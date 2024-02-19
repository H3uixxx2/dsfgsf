import ModalCreateUser from "./ModalCreateUser";
import "./ManageUser.scss";

const ManageUser = (props) => {
  return (
    <div className="manage-user-container">
      <div className="title">Manage User</div>
      <div className="users-content">
        <button>Add New User</button>
        <div className="table-users-container">table</div>
      </div>
      <ModalCreateUser />
    </div>
  );
};

export default ManageUser;

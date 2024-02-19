import ModalCreateUser from "./ModalCreateUser";

const ManageUser = (props) => {
  return (
    <div className="manage-user-container">
      <div className="title">Manage User</div>
      <div className="users-content">Add New User</div>
      <div className="table-users-container">
        table
        <ModalCreateUser />
      </div>
    </div>
  );
};

export default ManageUser;

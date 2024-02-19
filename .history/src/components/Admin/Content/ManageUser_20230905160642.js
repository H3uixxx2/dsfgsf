import ModalCreateUser from "./ModalCreateUser";
import "./ManageUser.scss";
import { FcPlus } from "react-icons/fc";
import TableUser from "./TableUser";
import { useEffect, useState } from "react";
import {
  getAllUsers,
  getUserWithPaginate,
} from "../../../services/apiServices";
import ModalUpdateUser from "./ModalUpdateUser";
import ModalDeleteUser from "./ModalDeleteUser";
import TableUserPaginate from "./TableUserPaginate";

const ManageUser = (props) => {
  return (
    <div className="manage-user-container">
      <div className="title">Manage User</div>
      <div className="users-content">Add New User</div>
      <div className="table-users-container">
        <TableUserPaginate
          listUsers={listUsers}
          handleClickBtnUpdate={handleClickBtnUpdate}
          handleClickBtnDelete={handleClickBtnDelete}
          fetchListUsersWithPaginate={fetchListUsersWithPaginate}
          pageCount={pageCount}
          currentPage={currentPage}
          setCurrentPage={setCurrentPage}
        />
      </div>
    </div>
  );
};

export default ManageUser;

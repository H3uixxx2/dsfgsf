import React, { useState } from "react";
import { Button } from "react-bootstrap/Button";
import { Modal } from "react-bootstrap/Modal";

const ManageUser = (props) => {
  return (
    <div className="manage-user-container">
      <div className="title">Manage User</div>
      <div className="users-content">Add New User</div>
      <div className="table-users-container">
        {/* <TableUserPaginate
          listUsers={listUsers}
          handleClickBtnUpdate={handleClickBtnUpdate}
          handleClickBtnDelete={handleClickBtnDelete}
          fetchListUsersWithPaginate={fetchListUsersWithPaginate}
          pageCount={pageCount}
          currentPage={currentPage}
          setCurrentPage={setCurrentPage}
        /> */}
      </div>
    </div>
  );
};

export default ManageUser;

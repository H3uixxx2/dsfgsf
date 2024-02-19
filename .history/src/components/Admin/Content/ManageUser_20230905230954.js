import React, { useState } from "react";
import { Button } from "react-bootstrap/Button";
import { Modal } from "react-bootstrap/Modal";

const ManageUser = (props) => {
  return (
    <div className="manage-user-container">
      <div className="title">Manage User</div>
      <div className="users-content">
        <div className="btn-add-new">
          <button
            className="btn btn-light"
            onClick={() => setShowModalCreateUser(true)}
          >
            {" "}
            <FcPlus /> Add New Users
          </button>
        </div>
        <div className="table-users-container">table</div>
      </div>
    </div>
  );
};

export default ManageUser;

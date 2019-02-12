package com.nguyendinhdoan.toeic.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "m_role")
public class RoleDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_CODE")
    private int roleCode;
    @Column(name = "ROLE_NAME")
    private String roleName;
    @OneToMany(mappedBy = "roleDTO", fetch = FetchType.LAZY)
    private List<UserDTO> userList;

    public int getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(int roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }
}

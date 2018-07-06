package com.trycatch.eurekabean.data.txhims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "users")
@Entity(name="com.trycatch.eurekabean.data.txhims.entity.UserTestEntity")
public class UserEntity extends BaseEntity {
    private static final long serialVersionUID= 21312312313123123L;

    @Column(name="name")
    private String name;

    @Column(name="realname")
    private String realname;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="hospital_id")
    private String hospitalId;

    @Column(name="is_delete")
    private boolean isDelete;

    @Column(name="role_id")
    private Long roleId;

    @Column(name="add_from")
    private Long addFrom;

    @Column(name="report_doctor")
    private String reportDoctor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getAddFrom() {
        return addFrom;
    }

    public void setAddFrom(Long addFrom) {
        this.addFrom = addFrom;
    }

    public String getReportDoctor() {
        return reportDoctor;
    }

    public void setReportDoctor(String reportDoctor) {
        this.reportDoctor = reportDoctor;
    }
}
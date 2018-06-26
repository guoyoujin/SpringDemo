package com.trycatch.eurekabean.data.txhims.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    private static final long serialVersionUID= 21312312313123123L;


    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="salt")
    private String salt;

    @Column(name="role")
    private Integer role;

    @Column(name="first_login")
    private Integer firstLogin;

    @Column(name="realname")
    private String realname;

    @Column(name="has_delete")
    private Boolean hasDelete;

    @Column(name="doctor_id")
    private Long doctorId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Integer firstLogin) {
        this.firstLogin = firstLogin;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Boolean getHasDelete() {
        return hasDelete;
    }

    public void setHasDelete(Boolean hasDelete) {
        this.hasDelete = hasDelete;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                ", id='" + this.getId() + '\'' +
                ", created_at='" + this.getCreatedAt() + '\'' +
                ", updated_at='" + this.getUpdatedAt() + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", salt='" + salt + '\'' +
                ", role=" + role +
                ", firstLogin=" + firstLogin +
                ", realname='" + realname + '\'' +
                ", hasDelete=" + hasDelete +
                ", doctorId=" + doctorId +
                '}';
    }
}
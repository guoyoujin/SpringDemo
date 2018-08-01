package com.trycatch.eurekabean.data.txdiag.entity;

import com.trycatch.custom.util.Converter.RoleConverter;
import com.trycatch.custom.util.enums.Role;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity(name="com.trycatch.eurekabean.data.txdiag.entity.UserEntity")
@Table(name = "users")
public class UserEntity extends BaseIdEntity {
    private static final long serialVersionUID= 21312313123123L;

    @Column(name="name")
    private String name;

    @Column(name="phone")
    private String phone;

    @Column(name="email")
    private String email;

    @Column(name="salt")
    private String salt;

    @Column(name="role")
    @Convert(converter = RoleConverter.class)
    private Role role;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;

        UserEntity that = (UserEntity) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) return false;
        if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) return false;
        if (getSalt() != null ? !getSalt().equals(that.getSalt()) : that.getSalt() != null) return false;
        if (getRole() != null ? !getRole().equals(that.getRole()) : that.getRole() != null) return false;
        if (getFirstLogin() != null ? !getFirstLogin().equals(that.getFirstLogin()) : that.getFirstLogin() != null)
            return false;
        if (getRealname() != null ? !getRealname().equals(that.getRealname()) : that.getRealname() != null)
            return false;
        if (getHasDelete() != null ? !getHasDelete().equals(that.getHasDelete()) : that.getHasDelete() != null)
            return false;
        return getDoctorId() != null ? getDoctorId().equals(that.getDoctorId()) : that.getDoctorId() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getSalt() != null ? getSalt().hashCode() : 0);
        result = 31 * result + (getRole() != null ? getRole().hashCode() : 0);
        result = 31 * result + (getFirstLogin() != null ? getFirstLogin().hashCode() : 0);
        result = 31 * result + (getRealname() != null ? getRealname().hashCode() : 0);
        result = 31 * result + (getHasDelete() != null ? getHasDelete().hashCode() : 0);
        result = 31 * result + (getDoctorId() != null ? getDoctorId().hashCode() : 0);
        return result;
    }
}
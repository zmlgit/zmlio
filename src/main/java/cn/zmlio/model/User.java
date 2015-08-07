package cn.zmlio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ZML on 2015/8/6.
 */
@Entity
@Table(name = "t_user")
public class User {

    private String userId;//用户ID，不是用int型而使用uuid是为了防止被人遍历

    private String email;

    private String phone;

    private boolean actived;

    private boolean enable;

    private boolean expired;

    @JsonIgnore
    private String password;

    @JsonIgnore
    private String salt;

    @JsonIgnore
    private Set<Role> roles;


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActived() {
        return actived;
    }

    public void setActived(boolean actived) {
        this.actived = actived;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @OneToMany(targetEntity = Role.class)
    @JoinTable(name = "t_user_role",joinColumns = @JoinColumn(name = "roleId"),inverseJoinColumns = @JoinColumn(name = "userId"))
    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

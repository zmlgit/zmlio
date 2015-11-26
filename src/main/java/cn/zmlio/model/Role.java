package cn.zmlio.model;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by ZML on 2015/8/6.
 */
@Entity
@Table(name = "t_role")
@Cacheable(value = true)
public class Role {

    private int roleId;

    private String roleName;

    @JsonIgnore
    private List<Access> accesses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @ManyToMany(targetEntity = Access.class)
    @JoinTable(name = "t_role_access", joinColumns = @JoinColumn(name = "access_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    public List<Access> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<Access> accesses) {
        this.accesses = accesses;
    }
}

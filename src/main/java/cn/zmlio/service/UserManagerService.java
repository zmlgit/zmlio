package cn.zmlio.service;

import cn.zmlio.model.Role;
import cn.zmlio.model.User;

import java.util.Collection;

/**
 * Created by ZML on 2015/9/23.
 */
public interface UserManagerService {

    void saveOrUpdateUser(User user);

    void saveOrUpdateUser(Collection<User> users);

    long getUserNumber();

    Role getRoleByName(String name);

}

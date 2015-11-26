package cn.zmlio.service.impl;

import cn.zmlio.dao.UserDao;
import cn.zmlio.model.Role;
import cn.zmlio.model.User;
import cn.zmlio.service.UserManagerService;
import cn.zmlio.utils.EndecryptUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZML on 2015/9/23.
 */
@Service
public class UserManagerServiceImpl implements UserManagerService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveOrUpdateUser(User user) {
        if (user.getUserId() == 0)//表示这个用户的id是空的
        {
            User endcryptUser = EndecryptUtils.md5Password(user.getUsername(), user.getPassword());

            user.setPassword(endcryptUser.getPassword());

            user.setSalt(endcryptUser.getSalt());
        }
        userDao.saveOrUpdate(user);
    }

    @Override
    public void saveOrUpdateUser(Collection<User> users) {

        if (users == null)
            return;

        for (User user : users) {
            saveOrUpdateUser(user);
        }
    }

    @Override
    public long getUserNumber() {
        return userDao.getUserNumber();
    }

    @Override
    public Role getRoleByName(String name) {
        return userDao.getRoleByName(name);
    }

    @Override
    public Set<String> getUserRoleNames(String username) {

        User user = this.queryUniqueUser(username);

        if(user ==null){
            return null;
        }
        Set<String> roleNames=new HashSet<>();

        for (Role role : user.getRoles()) {
            roleNames.add(role.getRoleName());
        }
        return roleNames;
    }

    @Override
    public Set<String> getUserPermissions(String username) {
        return null;
    }

    @Override
    public User queryUniqueUser(String username) {
        return userDao.getUserByPrincipal(username);
    }
}

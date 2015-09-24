package cn.zmlio.dao;

import cn.zmlio.model.Role;

/**
 * Created by ZML on 2015/9/23.
 */
public interface UserDao extends IBaseDao{

    public long getUserNumber();

    Role getRoleByName(String name);
}

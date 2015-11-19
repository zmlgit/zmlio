package cn.zmlio.dao.impl;

import cn.zmlio.dao.UserDao;
import cn.zmlio.model.Role;
import cn.zmlio.model.User;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ZML on 2015/9/23.
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public long getUserNumber() {

        String hql = "SELECT count(*) FROM User";

        List result = getHibernateTemplate().find(hql);

        for (Object object : result) {
            return (long) object;
        }
        return 0;
    }

    @Override
    public Role getRoleByName(String name) {
        String hql = "FROM Role r where r.roleName = ?";

        List result = getHibernateTemplate().find(hql, name);


        for (Object object : result) {
            return (Role) object;
        }

        return null;
    }

    @Override
    public User getUserByPrincipal(String principal) {

        User user = (User) getSession().createCriteria(User.class).
                add(Restrictions.disjunction().add(Restrictions.eq("username", principal))
                        .add(Restrictions.eq("phone", principal))
                        .add(Restrictions.eq("email", principal)))
                .uniqueResult();
        return user;


    }
}

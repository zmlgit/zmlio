package cn.zmlio.service;

import cn.zmlio.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ZML on 2015/9/24.
 */
public class UserManagerServiceTest {

    private ApplicationContext context;

    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    @Test
    public void saveOrUpdateUser(){

        UserManagerService service= context.getBean(UserManagerService.class);

        User user=new User();

        user.setUsername("user1");

        user.setEmail("112233@163.com");

        user.setPhone("12345678901");

        user.setPassword("user1");

        service.saveOrUpdateUser(user);
    }
    @Test
    public void getUserNumber(){
        UserManagerService service= context.getBean(UserManagerService.class);

        Assert.assertTrue(1 == service.getUserNumber());

    }


    @Test
    public void getUser(){
        UserManagerService service= context.getBean(UserManagerService.class);
        IBaseService baseService=context.getBean(IBaseService.class);

        System.out.println(baseService.get(User.class, 1));
    }

}

package cn.zmlio.service.utils;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * Created by ZML on 2015/8/28.
 */
public class ApplicationContextTest {

    @Test
    public void test(){
        org.springframework.context.ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        HibernateTemplate hibernateTemplate= ApplicationContext.getBean(HibernateTemplate.class);
    }
}

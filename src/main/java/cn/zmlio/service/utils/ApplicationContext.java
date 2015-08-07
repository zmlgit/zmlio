package cn.zmlio.service.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by ZML on 2015/8/7.
 */
@Service
public class ApplicationContext implements ApplicationContextAware {

    private static org.springframework.context.ApplicationContext context = null;

    private static Logger logger = Logger.getLogger(ApplicationContext.class);

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        logger.info("context registed");
    }

    public static org.springframework.context.ApplicationContext getContext() {

        assert(context !=null):"context is null";

        return context;
    }
}

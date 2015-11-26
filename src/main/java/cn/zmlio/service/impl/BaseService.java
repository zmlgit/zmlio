package cn.zmlio.service.impl;

import cn.zmlio.dao.IBaseDao;
import cn.zmlio.service.IBaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by ZML on 2015/9/24.
 */
@Service
public class BaseService<T> implements IBaseService<Object>{

    /**
     * 保存或者更新
     *
     * @param t
     */
    @Autowired
    private IBaseDao iBaseDao;


    @SuppressWarnings("unchecked")
	public T  get(Class<?> t,Serializable id){
     return (T)iBaseDao.get(t ,id);
    }

    @Override
    public void saveOrUpdate(Object o) {
        iBaseDao.saveOrUpdate(o);
    }

    @Override
    public void delete(Object o) {
        iBaseDao.deleteObject(o);
    }

}

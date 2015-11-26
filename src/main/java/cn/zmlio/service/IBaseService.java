package cn.zmlio.service;

import java.io.Serializable;

/**
 * Created by ZML on 2015/9/24.
 */
public interface IBaseService<T> {

    /**
     * 保存或者更新
     *
     * @param t
     */
    public void saveOrUpdate(T t);

    public void delete(T t);

    public T get(Class<?> t,Serializable id);


}

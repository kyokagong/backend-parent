package com.times.cloud.mybatis.core;


import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> implements IService<T> {

    @Autowired
    protected IMapper<T> IMapper;

    private Class<T> modelClass;    // 当前泛型真实类型的Class

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    public void save(T model) {
        IMapper.insertSelective(model);
    }

    public void save(List<T> models) {
        IMapper.insertList(models);
    }

    public void deleteById(Integer id) {
        IMapper.deleteByPrimaryKey(id);
    }

    public void deleteByIds(String ids) {
        IMapper.deleteByIds(ids);
    }

    public void update(T model) {
        IMapper.updateByPrimaryKeySelective(model);
    }

    public T findById(Integer id) {
        return IMapper.selectByPrimaryKey(id);
    }

    @Override
    public T findBy(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return IMapper.selectOne(model);
        } catch (NoSuchFieldException e) {
            throw new DaoException(e.getMessage(), e);
        } catch (IllegalAccessException e) {
            throw new DaoException(e.getMessage(), e);
        } catch (InstantiationException e) {
            throw new DaoException(e.getMessage(), e);
        }
    }

    public List<T> findByIds(String ids) {
        return IMapper.selectByIds(ids);
    }

    public List<T> findByCondition(Condition condition) {
        return IMapper.selectByCondition(condition);
    }

    public List<T> findAll() {
        return IMapper.selectAll();
    }
}

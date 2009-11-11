package cn.benjamin.loxia.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.benjamin.loxia.model.BaseModel;

public interface DaoService {
	<T extends BaseModel> T getByPrimaryKey(Class<T> clazz, Serializable pk);
	
	<T extends BaseModel> T save(T model);
	<T extends BaseModel> void delete(T model);
	<T extends BaseModel> void deleteByPrimaryKey(Class<T> clazz,Serializable pk);
	
	<T> T findOneByNamedQuery(String queryName, Map<String,Object> params);
	<T> List<T> findByNamedQuery(String queryName, Map<String,Object> params);
	<T> List<T> findByNamedQuery(String queryName, Map<String,Object> params, int start, int pageSize);
	int batchUpdateByNamedQuery(String queryName, Map<String,Object> params);
}

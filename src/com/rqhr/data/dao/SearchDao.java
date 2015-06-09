package com.rqhr.data.dao;

import com.rqhr.model.AbstractModel;

public interface SearchDao {
	public AbstractModel get(Class paramClass,long id);
	public int findAll(AbstractModel condition,AbstractModel result);
}

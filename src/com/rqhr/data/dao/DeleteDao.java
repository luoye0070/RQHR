package com.rqhr.data.dao;

import com.rqhr.model.AbstractModel;

public interface DeleteDao {
	public boolean delete(Class paramClass,long id);
	public int delete(AbstractModel model);
}

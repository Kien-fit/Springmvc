package com.trainningjavaweb.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.trainningjavaweb.dao.INewDAO;
import com.trainningjavaweb.mapper.NewMapper;
import com.trainningjavaweb.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}
}

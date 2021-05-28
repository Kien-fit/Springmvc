package com.trainningjavaweb.dao;

import java.util.List;

import com.trainningjavaweb.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}

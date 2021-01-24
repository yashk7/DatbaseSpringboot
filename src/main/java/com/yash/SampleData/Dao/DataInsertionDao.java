package com.yash.SampleData.Dao;

import org.springframework.data.repository.CrudRepository;

import com.yash.SampleData.Bean.UsersDetails;

public interface DataInsertionDao extends CrudRepository<UsersDetails, Integer>
{
	
	

}

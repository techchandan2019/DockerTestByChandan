package com.bonami.repository;

import org.springframework.data.repository.CrudRepository;

import com.bonami.model.Emp;


public interface IEmpRepo extends CrudRepository<Emp, Integer> {

	
}

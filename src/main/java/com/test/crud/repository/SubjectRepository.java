package com.test.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.crud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}

package com.studentapp.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,Integer>{
	
	List<Student> findByAuthor(String name);
	List<Student> findByDept(String dept);
	Student findById(Integer studentId);
	Student deleteById(Integer studentId);
	
}

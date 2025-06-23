package com.example.StudentCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.repository.StudentRepository;

@Service
public class StudentService {
	
//	public static final String delete = null;
	@Autowired
	private StudentRepository repo;

	public List<Student> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();	
	}

	public void save(Student std) {
		// TODO Auto-generated method stub
		repo.save(std);
	}
	
	public Student get(int id) {
		return repo.findById(id).get();
	}
 
	public void delete (int id) {
		repo.deleteById(id);
	}
}

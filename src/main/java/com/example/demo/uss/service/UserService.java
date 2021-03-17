package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.uss.domain.User;


public interface UserService {
	
	public long count();
	public boolean existsById(long id);
	public List<User> findAll();
	public Optional<User> findOne();
	public void deleteById(long id);
	public User getOne(long id);
	public User save(User entity);
}

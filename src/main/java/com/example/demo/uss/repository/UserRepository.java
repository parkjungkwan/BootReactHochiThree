package com.example.demo.uss.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.uss.domain.User;

interface UserCustomRepository{
	public Optional<User> findByUsername(String username);
}
public interface UserRepository extends JpaRepository<User, Long>,
										UserCustomRepository{

}

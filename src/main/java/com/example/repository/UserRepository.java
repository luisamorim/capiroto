package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.bean.User;

@RepositoryRestResource
public interface UserRepository extends MongoRepository<User,String>{

	public User findByLogin(String login);
}

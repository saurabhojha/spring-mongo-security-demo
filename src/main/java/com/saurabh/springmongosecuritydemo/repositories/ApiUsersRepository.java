package com.saurabh.springmongosecuritydemo.repositories;

import com.saurabh.springmongosecuritydemo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ApiUsersRepository extends MongoRepository<User,String> {

    Optional<User> findByUsername(String username);

}

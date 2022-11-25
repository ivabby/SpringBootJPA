package com.demo.springboot.repository;

import com.demo.springboot.model.User;
import org.springframework.data.repository.CrudRepository;

//  First Field is Model Class
//  Second Field is Primary Key Data Type
public interface UserRepository extends CrudRepository<User, Integer> {
}

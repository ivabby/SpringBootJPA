package com.demo.springboot.repository;

import com.demo.springboot.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//  First Field is Model Class
//  Second Field is Primary Key Data Type
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    //  Custom Finder methods
    public List<User> findByName(String name);

    // JPQL -> Java Persistent Query Language
    @Query("select u from User u where u.name=:name")
    public List<User> getUserByName(@Param("name") String name);

    //  Native Query -> It defines query in the DB format
    //  If DB is SQL then write query of SQL
    //  Native Query = true we need to define by default it is false
    @Query(value = "select * from user", nativeQuery = true)
    public List<User> getAllUsers();
}

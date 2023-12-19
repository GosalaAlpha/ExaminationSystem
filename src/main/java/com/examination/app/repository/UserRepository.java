package com.examination.app.repository;

import com.examination.app.entity.User_App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User_App, Integer> {

   
    Optional<User_App> findUserByEmail(String email);

    
    Boolean existsByEmail(String email);
}

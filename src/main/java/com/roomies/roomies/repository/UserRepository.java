package com.roomies.roomies.repository;

import com.roomies.roomies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface UserRepository extends JpaRepository<User, Id> {

    User findByName(String name);
}

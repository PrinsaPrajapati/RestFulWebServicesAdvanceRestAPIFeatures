package com.prinsa.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prinsa.rest.webservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

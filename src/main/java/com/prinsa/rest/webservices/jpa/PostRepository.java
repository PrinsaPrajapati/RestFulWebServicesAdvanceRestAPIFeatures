package com.prinsa.rest.webservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prinsa.rest.webservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}

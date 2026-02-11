package com.in28minutes.rest.webservices.restful_web_services.jpa;

import com.in28minutes.rest.webservices.restful_web_services.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Integer> {
    Optional<Post> findByIdAndUserId(int id, int userId);
}

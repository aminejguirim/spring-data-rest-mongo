package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Post;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    public List<Post> findByName(String name);

}

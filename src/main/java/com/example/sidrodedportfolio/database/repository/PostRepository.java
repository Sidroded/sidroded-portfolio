package com.example.sidrodedportfolio.database.repository;

import com.example.sidrodedportfolio.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}

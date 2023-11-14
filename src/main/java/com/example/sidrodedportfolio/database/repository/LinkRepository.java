package com.example.sidrodedportfolio.database.repository;

import com.example.sidrodedportfolio.models.Link;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository  extends MongoRepository<Link, String> {
}

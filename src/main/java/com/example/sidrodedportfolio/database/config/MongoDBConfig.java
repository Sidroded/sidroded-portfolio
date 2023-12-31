package com.example.sidrodedportfolio.database.config;

import com.example.sidrodedportfolio.database.repository.LinkRepository;
import com.example.sidrodedportfolio.database.repository.PostRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = {PostRepository.class, LinkRepository.class})
public class MongoDBConfig {

}
package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.demo.DAO.PersonneRepository;
import com.example.demo.DAO.PostRepository;
import com.example.demo.model.Personne;
import com.example.demo.model.Post;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class })
public class FirstSpringDataRestMongoApplication implements ApplicationRunner {

	private final Logger logger = LoggerFactory.getLogger(FirstSpringDataRestMongoApplication.class);

    @Autowired
    private PostRepository postRepository;
     
	@Autowired
	private PersonneRepository personneRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringDataRestMongoApplication.class, args);
	}
	
	
	@Override
    public void run(ApplicationArguments args) throws Exception {

    }
}

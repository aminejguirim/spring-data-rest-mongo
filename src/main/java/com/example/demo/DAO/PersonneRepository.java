package com.example.demo.DAO;


import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Personne;

@RepositoryRestResource
public interface PersonneRepository extends MongoRepository<Personne, String> {
	
}


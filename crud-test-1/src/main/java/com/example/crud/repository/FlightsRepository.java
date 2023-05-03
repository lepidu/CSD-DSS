package com.example.crud.repository;


import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.model.Flights;

public interface FlightsRepository extends MongoRepository <Flights, String> {
	
	

}

package com.example.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.example.crud.model.Flights;


public interface FlightsRepository extends MongoRepository <Flights, String> {

	


	

}

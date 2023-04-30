package com.example.flights.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.flights.entity.Flight;

@Repository
public interface FlightRepository extends MongoRepository <Flight, String>{


}

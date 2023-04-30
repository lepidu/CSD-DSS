package com.example.flights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flights.entity.Flight;
import com.example.flights.service.FlightService;


@RestController
@RequestMapping("/flights/")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	@PostMapping("/flights/save")
	public ResponseEntity<String> createFlights(@RequestBody Flight flight){
		
		return new ResponseEntity<String>(flightService.saveFlight(flight), HttpStatus.OK);
		
	}

	@GetMapping ("/flights/get")
	public ResponseEntity<List<Flight>> readAllFlight(){
		return new ResponseEntity<List<Flight>>(flightService.getAllFlight(), HttpStatus.OK);
	}

	@GetMapping ("/flights/{id}")
	public ResponseEntity<Flight> readAllFlightById(@PathVariable String id){
		return new ResponseEntity<Flight>(flightService.getFlightById(id), HttpStatus.OK);
	}
	
	@DeleteMapping ("flights/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable String id){
		return new ResponseEntity<String>(flightService.deleteFlightById(id), HttpStatus.OK);
	}
}

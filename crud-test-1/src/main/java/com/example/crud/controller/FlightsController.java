package com.example.crud.controller;



import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Flights;
import com.example.crud.repository.FlightsRepository;


@RestController
@RequestMapping
public class FlightsController {

	@Autowired
	 private FlightsRepository repository;
	
	
	public FlightsController(FlightsRepository repository) {
		
		this.repository = repository;
	}

	@PostMapping("/addFlights")
	public String saveFlights(@RequestBody Flights flights) {
		repository.save(flights);

		return "Added flights with id: " + flights.get_id();

	}

	@GetMapping("/findAllFlights")
	public List<Flights> getFlights() {

		return repository.findAll();
	}

	@GetMapping("/findAllFlights/{_id}")
	public Optional<Flights> getFlights(@PathVariable String _id) {

		return repository.findById(_id);

	}

	@DeleteMapping("/delete/{_id}")
	public String deleteFlights(@PathVariable String _id) {
		repository.deleteById(_id);

		return "Flight deleted with id: " + _id;
	}

}


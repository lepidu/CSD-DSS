package com.example.flights.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flights.entity.Flight;
import com.example.flights.repository.FlightRepository;

@Service
public class FlightServiceImp implements FlightService {

	@Autowired
	FlightRepository flightRepo;
	
	@Override
	public String saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepo.save(flight);
		return "Flight id: "+ flight.getId() + "is saved succesfully";
	}

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return flightRepo.findAll();
	}

	@Override
	public Flight getFlightById(String id) {
		// TODO Auto-generated method stub
		return flightRepo.findById(id).get();
	}

	@Override
	public String deleteFlightById(String id) {
		// TODO Auto-generated method stub
		boolean delete = false;
		if (flightRepo.existsById(id)) {
			flightRepo.deleteById(id);
			delete = true;
		}
		return "Flight with id: " + id + " deleted status "+ delete;
	}
}

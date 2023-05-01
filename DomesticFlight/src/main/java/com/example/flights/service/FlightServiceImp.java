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
	public Flight saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepo.save(flight);
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
	public void deleteFlightById(String id) {
		// TODO Auto-generated method stub
		flightRepo.deleteById(id);
	}

	@Override
	public Flight updateFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepo.save(flight);
	}
}

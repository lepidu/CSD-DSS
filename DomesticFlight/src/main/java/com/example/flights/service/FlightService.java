package com.example.flights.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.flights.entity.Flight;

@Service
public interface FlightService {


	public Flight saveFlight(Flight flight);
	public List<Flight> getAllFlight();
	public Flight getFlightById(String id);
	public void deleteFlightById(String id);
	public Flight updateFlight(Flight flight);
}

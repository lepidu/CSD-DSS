package com.example.flights.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.flights.entity.Flight;

@Service
public interface FlightService {


	String saveFlight(Flight flight);
	List<Flight> getAllFlight();
	Flight getFlightById(String id);
	String deleteFlightById(String id);
}

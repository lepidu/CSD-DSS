package com.example.flights.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.flights.entity.Flight;
import com.example.flights.service.FlightService;


@Controller
@RequestMapping("/flights/")
public class FlightController {
	@Autowired
	private FlightService flightService;
	
	@GetMapping("/flights/newFlight")
	public String formFlight(Model model) {
		//Flight flight = new Flight();
		model.addAttribute("flights", flightService.getAllFlight());
		return "newFlight";
	}

	@GetMapping ({"/flights","/"})
	public String readAllFlight( Model model){
		model.addAttribute("flights", flightService.getAllFlight());
		return "flights";
	}
	
	@PostMapping ("/flights")
	public String saveFlight(@ModelAttribute("flights") Flight flight ){
		flightService.saveFlight(flight);
		return "redirect:/flights";
	}

	@GetMapping ("/flights/update/{id}")
	public String updateAllFlightById(@PathVariable String id, Model model){
		model.addAttribute("flights", flightService.getFlightById(id));
		return "update";
	}
	
	@PostMapping ("/flights/{id}")
	public String updateFlight(@PathVariable String id, @ModelAttribute("flights") Flight flight, Model model ){
		Flight existingFlight = flightService.getFlightById(id);
		existingFlight.setId(id);
		existingFlight.setYear(flight.getYear());
		existingFlight.setMonth(flight.getMonth());
		existingFlight.setDayMonth(flight.getDayMonth());
		existingFlight.setDayWeek(flight.getDayWeek());
		existingFlight.setDepTime(flight.getDepTime());
		existingFlight.setCRSdepTime(flight.getCRSdepTime());
		existingFlight.setArrTime(flight.getArrTime());
		existingFlight.setCRSarrTime(flight.getCRSarrTime());
		existingFlight.setElapsedTime(flight.getElapsedTime());
		existingFlight.setCRSelapsedTime(flight.getCRSelapsedTime());
		existingFlight.setAirTime(flight.getAirTime());
		existingFlight.setArrDelay(flight.getArrDelay());
		existingFlight.setDepDelay(flight.getDepDelay());
		existingFlight.setOrigin(flight.getOrigin());
		existingFlight.setDest(flight.getDest());
		existingFlight.setDistance(flight.getDistance());
		existingFlight.setTaxiIn(flight.getTaxiIn());
		existingFlight.setTaxiOut(flight.getTaxiOut());
		existingFlight.setCancelled(flight.getCancelled());
		existingFlight.setDiverted(flight.getDiverted());
		
		flightService.updateFlight(existingFlight);
		return "redirect:/flights";
	}
	
	@GetMapping ("/flights/{id}")
	public String deleteFlight(@PathVariable String id){
		flightService.deleteFlightById(id);
		return "redirect:/flights";
	}
}

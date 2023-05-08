package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import com.example.crud.model.Flights;
import com.example.crud.repository.FlightsRepository;





@Controller


public class FlightsController {

	@Autowired
	 private FlightsRepository repository;
	
	public FlightsController(FlightsRepository repository) {
		
		this.repository = repository;
	}

	@GetMapping({"/index", "/"})
	public String home(Model model, @RequestParam(defaultValue = "0") int page) {
	    int pageSize = 10; // The number of items per page
	    
	    Pageable pageable = PageRequest.of(page, pageSize);
	    
	    Page<Flights> flights = repository.findAll(pageable);
	    
	    model.addAttribute("flights", flights.getContent());
	    model.addAttribute("currentPage", page);
	    model.addAttribute("totalPages", flights.getTotalPages());
	    
	    return "index";
	}

	@GetMapping("/index/newFlight")
	public String formFlight(Model model) {
		Flights flights = new Flights();
		model.addAttribute("flights", flights);
		return "newFlight";
	}

	@GetMapping ("/index/update/{_id}")
	public String updateAllFlightById(@PathVariable String _id, Model model){
		model.addAttribute("flights", repository.findById(_id).orElse(null));
		return "update";
	}

	@PostMapping("/index")
	public String saveFlights(@ModelAttribute ("flights") Flights flights) {
		repository.save(flights);
		return "redirect:/index";
	}

	@PostMapping ("/index/{_id}")
	public String updateFlight(@PathVariable String _id, @ModelAttribute("flights") Flights flight, Model model ){
		Flights existingFlight = repository.findById(_id).get();
		existingFlight.setYear(flight.getYear());
		existingFlight.setMonth(flight.getMonth());
		existingFlight.setDayOfMonth(flight.getDayofMonth());
		existingFlight.setDeepTime(flight.getDepTime());
		existingFlight.setCRSDepTime(flight.getCRSDepTime());
		existingFlight.setArrTime(flight.getArrTime());
		existingFlight.setCRSArrTime(flight.getCRSArrTime());
		existingFlight.setOrigin(flight.getOrigin());
		existingFlight.setDest(flight.getDest());
		repository.save(existingFlight);
		return "redirect:/index";
	}
	
//	@GetMapping("/search")
//	public String search (@RequestParam String _id) {
//		Optional<Flights> flight = repository.findById(_id);
//		if (flight.isPresent()) {
//			// do something with the flight
//		} else {
//			// handle flight not found case
//		}
//		return "home";
//	}
//
//	
//	@GetMapping("/search")
//	public String search(Model model, @RequestParam String _id) {
//	    List<Flights> flights = new ArrayList<>();
//	    Flights flight = repository.findById(_id).orElse(null);
//	    if (flight != null) {
//	        flights.add(flight);
//	    }
//	    model.addAttribute("flights", flights);
//	    return "home";
//	}

	
	@GetMapping("/index/{_id}")
    public String deleteFlightById(@PathVariable("_id") String _id ) {
        repository.deleteById(_id);
        return "redirect:/index";
    }
}


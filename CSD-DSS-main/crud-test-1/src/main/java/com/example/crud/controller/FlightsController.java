package com.example.crud.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import com.example.crud.model.Flights;
import com.example.crud.repository.FlightsRepository;
import com.example.crud.dto.UserDto;
import com.example.crud.entity.User;
import com.example.crud.service.UserService;

import jakarta.validation.Valid;


@Controller


public class FlightsController {

	@Autowired
	 private FlightsRepository repository;
	
	
	public FlightsController(FlightsRepository repository) {
		
		this.repository = repository;
	}
	

    private UserService userService;

    public FlightsController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("index")
    public String home(){
        return "index";
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    // handler method to handle user registration request
    @GetMapping("register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    // handler method to handle register user form submit request
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model){
        User existing = userService.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }

    @GetMapping("/users")
    public String listRegisteredUsers(Model model){
        List<UserDto> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
	

	@GetMapping("/home")
	public String home(Model model, @RequestParam(defaultValue = "0") int page) {
	    int pageSize = 10; // The number of items per page
	    
	    Pageable pageable = PageRequest.of(page, pageSize);
	    
	    Page<Flights> flights = repository.findAll(pageable);
	    
	    model.addAttribute("flightsList", flights.getContent());
	    model.addAttribute("currentPage", page);
	    model.addAttribute("totalPages", flights.getTotalPages());
	    
	    return "home";
	}



	
	@PostMapping("/addFlights")
	public String saveFlights(@ModelAttribute Flights flights) {
		repository.save(flights);
		return "redirect:/home";
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

	
	@GetMapping("/search")
	public String search(Model model, @RequestParam String _id) {
	    List<Flights> flights = new ArrayList<>();
	    Flights flight = repository.findById(_id).orElse(null);
	    if (flight != null) {
	        flights.add(flight);
	    }
	    model.addAttribute("flightsList", flights);
	    return "home";
	}

	
	@PostMapping("/delete")
    public String deleteFlightById(@RequestParam String _id) {
        repository.deleteById(_id);
        return "redirect:/home";
    }
}


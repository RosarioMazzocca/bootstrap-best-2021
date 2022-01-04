package org.generation.italy.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Gruppo 1: Rosario Mazzocca, Roberta Angioni, Alessandro Caraffa, Gianluca Pensa

@Controller 
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String index(Model model, @RequestParam(name="Nome", defaultValue="Default") String nameParam) {
		
		if(nameParam == null) {
			nameParam = "Default";
		}
		
		model.addAttribute("name", "Rosario");
		
		return "index";
	}
	
	@GetMapping("/movies")
	public String movies (Model model) {
		
		List<String> moviesList = new ArrayList<String>();
		
		model.addAttribute("movies", Arrays.asList("Dune", "Shang-chi e la leggenda dei dieci anelli", "Eternals", "Venom - la furia di Carnage "));
		
		return "movies";
	}
	
	@GetMapping("/songs")
	public String songs (Model model) {
		
		List<String> songsList = new ArrayList<String>();
		
		model.addAttribute("songs", Arrays.asList("Kiss Me More", "Zitti E Buoni", "STAY", "Friday"));
		
		return "songs";
	}
}

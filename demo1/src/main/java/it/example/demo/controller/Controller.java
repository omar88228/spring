package it.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@GetMapping("/test")
	public List<String> testing(){
		List<String>lista = new ArrayList<>();
		lista.add("omar00");
		return lista;
	}
}

package com.tumadre.app.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumadre.app.entity.Person;
import com.tumadre.app.services.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class StatsController {

	private final PersonService personService;

	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}

	@PostMapping("/prueba")
	public ResponseEntity<Void> newPerson(@RequestBody Person p) {
		personService.save(p);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/prueba")
	public ResponseEntity<List<Person>> getPersons() {
		return ResponseEntity.status(HttpStatus.OK).body(personService.getPersons());
	}
}

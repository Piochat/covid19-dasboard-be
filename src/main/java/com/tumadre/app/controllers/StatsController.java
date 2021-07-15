package com.tumadre.app.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tumadre.app.entity.Departaments;
import com.tumadre.app.entity.Municipalities;
import com.tumadre.app.entity.Person;
import com.tumadre.app.services.DepartamentService;
import com.tumadre.app.services.MunicipalityService;
import com.tumadre.app.services.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class StatsController {

	private final PersonService personService;
	private final MunicipalityService municipalityService;
	private final DepartamentService departamentService;

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
	
	@GetMapping("/dep")
	public ResponseEntity<List<Departaments>> getAllDep() {
		return ResponseEntity.status(HttpStatus.OK).body(departamentService.getAll());
	}
	
	@GetMapping("/dep/{id}")
	public ResponseEntity<Departaments> getById(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(departamentService.getById(id));
	}
	
	@GetMapping("/muni")
	public ResponseEntity<List<Municipalities>> getAllMuni() {
		return ResponseEntity.status(HttpStatus.OK).body(municipalityService.getAll());
	}
	
	@GetMapping("/muni/{id}")
	public ResponseEntity<Municipalities> getMuniById(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(municipalityService.getById(id));
	}
}

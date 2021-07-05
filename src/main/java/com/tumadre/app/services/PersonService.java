package com.tumadre.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tumadre.app.entity.Person;
import com.tumadre.app.repository.PersonRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class PersonService {
	
	private final PersonRepository personRepository;
	
	public void save(Person person) {
		personRepository.save(person);
		log.info("Creado");
	}
	
	public List<Person> getPersons() {
		return personRepository.findAll();
	}
}

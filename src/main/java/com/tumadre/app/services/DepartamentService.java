package com.tumadre.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tumadre.app.entity.Departaments;
import com.tumadre.app.repository.DepartamentsRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartamentService {

	DepartamentsRepository departamentsRepository;

	public List<Departaments> getAll() {
		return departamentsRepository.findAll();
	}

	public Departaments getById(Long id) {
		var d = departamentsRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Información inválida"));
		return d;
	}
}

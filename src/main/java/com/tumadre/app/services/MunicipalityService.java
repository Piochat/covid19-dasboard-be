package com.tumadre.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tumadre.app.entity.Municipalities;
import com.tumadre.app.repository.MunicipalitiesRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MunicipalityService {

	private final MunicipalitiesRepository municipalitiesRepository;
	
	public List<Municipalities> getAll() {
		return municipalitiesRepository.findAll();
	}

	public Municipalities getById(Long id) {
		var d = municipalitiesRepository.findById(id)
				.orElseThrow(() -> new IllegalStateException("Información inválida"));
		return d;
	}
}

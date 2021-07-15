package com.tumadre.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tumadre.app.entity.Municipalities;

@Repository
public interface MunicipalitiesRepository extends JpaRepository<Municipalities, Long> {

}

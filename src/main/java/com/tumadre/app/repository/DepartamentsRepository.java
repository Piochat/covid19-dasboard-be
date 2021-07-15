package com.tumadre.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tumadre.app.entity.Departaments;

@Repository
public interface DepartamentsRepository extends JpaRepository<Departaments, Long> {

}

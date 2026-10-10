package com.example.eduardo.citas_medicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eduardo.citas_medicas.entities.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}

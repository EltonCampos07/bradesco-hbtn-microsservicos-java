package com.example_.Artifact.jpa_h2_demo.jpa_h2_demo.repository;

import com.example_.Artifact.jpa_h2_demo.jpa_h2_demo.jpa_h2_demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

package com.example.autoloc.repositories;

import com.example.autoloc.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryPayement extends JpaRepository<Payment,Long> {
}

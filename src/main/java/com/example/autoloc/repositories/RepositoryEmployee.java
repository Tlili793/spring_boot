package com.example.autoloc.repositories;

import com.example.autoloc.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee,Long> {
}

package com.example.autoloc.repositories;

import com.example.autoloc.entities.Reservation;
import org.springframework.cglib.core.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository  extends JpaRepository<Reservation,Long> {
     Reservation findByStartDate (LocalDate d);
     List<Reservation> findByStartDateBetween(LocalDate start, LocalDate end);
}

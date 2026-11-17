package com.example.autoloc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Reservation {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReservation;

    LocalDate startDate;
    LocalDate endDate;

    ReservationStatus reservationStatus;

    @ManyToOne
    Vehicle vehicle;

    @ManyToOne
            (cascade = CascadeType.ALL)
    Client client;

    @OneToOne
    Contract contract;
}
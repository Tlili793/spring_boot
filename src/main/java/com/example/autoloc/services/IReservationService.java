package com.example.autoloc.services;

import com.example.autoloc.entities.Reservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation r);
    Reservation updateReservation(Reservation r);
    void deleteReservation(long idreservation);
    Reservation findReservation(long idreservation);
    List<Reservation> getListReservations();
    List<Reservation> addlistReservations(List<Reservation> reservations);
    Reservation setByDate(LocalDate d);
    List<Reservation> getR(LocalDate start,LocalDate end);
    Reservation assign(Reservation r);
}

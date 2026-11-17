package com.example.autoloc.services;

import com.example.autoloc.entities.Reservation;
import com.example.autoloc.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private final ReservationRepository rrep;
    @Override
    public Reservation addReservation(Reservation r) {
        return rrep.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return rrep.save(r);
    }

    @Override
    public void deleteReservation(long idreservation) {
        rrep.deleteById(idreservation);

    }

    @Override
    public Reservation findReservation(long idreservation) {
        return rrep.findById(idreservation).orElse(null);
    }

    @Override
    public List<Reservation> getListReservations() {
        return rrep.findAll();
    }

    @Override
    public List<Reservation> addlistReservations(List<Reservation> reservations) {
        return rrep.saveAll(reservations);
    }

    @Override
    public Reservation setByDate(LocalDate d) {
        return rrep.findByStartDate(d);
    }

    @Override
    public List<Reservation> getR(LocalDate start, LocalDate end) {
        return rrep.findByStartDateBetween(start,end);
    }

    @Override
    public Reservation assign(Reservation r) {
        Reservation rr =rrep.save(r);
        return rr;
    }
}

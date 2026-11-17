package com.example.autoloc.controllers;

import com.example.autoloc.entities.Reservation;
import com.example.autoloc.services.IReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private final IReservationService  ires;
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r){
        return ires.addReservation(r);

    }
    @PutMapping("/updateReservation")
    Reservation updateReservation(@RequestBody Reservation r){
        return ires.updateReservation(r);

    }
    @DeleteMapping("/deleteReservation/{idreservation}")
    void deleteReservation(@PathVariable long idreservation){
         ires.deleteReservation(idreservation);
    }
    @GetMapping("/findReservation/{idreservation}")
    Reservation findReservation(@PathVariable long idreservation){
        return ires.findReservation(idreservation);
    }
    @PostMapping("/addlistReservations")
    List<Reservation> addlistReservations(@RequestBody List<Reservation> reservations){
        return ires.addlistReservations(reservations);
    }
    @GetMapping("/getListReservations")
    List<Reservation> getListReservations(){
        return ires.getListReservations();
    }
    @GetMapping("/findByStartDate/{d}")
    Reservation findByStartDate (@PathVariable LocalDate d) {
        return ires.setByDate(d);
    }
    @GetMapping("/findBybetween/{start}/{end}")
    List<Reservation> getR(@PathVariable LocalDate start,@PathVariable LocalDate end)
    {
        return ires.getR(start,end);
    }







}

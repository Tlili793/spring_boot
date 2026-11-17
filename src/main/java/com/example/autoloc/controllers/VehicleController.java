package com.example.autoloc.controllers;

import com.example.autoloc.entities.Vehicle;
import com.example.autoloc.entities.VehicleStatus;
import com.example.autoloc.services.IReservationService;
import com.example.autoloc.services.IVechiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    private final IVechiculeService vres;
    @GetMapping("/findvehicleStatus/{s}/{e}")
    Vehicle getV(@PathVariable VehicleStatus s,@PathVariable String e){
        return vres.getV(s,e);
    }



}

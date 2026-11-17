package com.example.autoloc.services;

import com.example.autoloc.entities.Vehicle;
import com.example.autoloc.entities.VehicleStatus;

public interface IVechiculeService {
    Vehicle getV(VehicleStatus s,String e);
}

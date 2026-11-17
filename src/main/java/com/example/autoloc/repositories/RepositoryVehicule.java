package com.example.autoloc.repositories;

import com.example.autoloc.entities.Vehicle;
import com.example.autoloc.entities.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryVehicule extends JpaRepository<Vehicle,Long> {
    Vehicle findByStatusAndEquipments_Label (VehicleStatus s,String e);

}

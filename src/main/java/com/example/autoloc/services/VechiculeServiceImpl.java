package com.example.autoloc.services;

import com.example.autoloc.entities.Vehicle;
import com.example.autoloc.entities.VehicleStatus;
import com.example.autoloc.repositories.RepositoryVehicule;
import com.example.autoloc.repositories.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VechiculeServiceImpl implements IVechiculeService {
    private final RepositoryVehicule vrep;
    @Override
    public Vehicle getV(VehicleStatus s, String e) {
        return vrep.findByStatusAndEquipments_Label(s,e);
    }
}

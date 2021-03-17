package sn.niang.repository;

import sn.niang.domain.Vehicule;

public interface VehiculeRepository {
    Vehicule[] getAll();
    Vehicule findById(int idVehicule);
}

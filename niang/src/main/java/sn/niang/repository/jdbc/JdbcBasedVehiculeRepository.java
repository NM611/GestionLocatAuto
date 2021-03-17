package sn.niang.repository.jdbc;

import sn.niang.domain.Vehicule;
import sn.niang.repository.VehiculeRepository;

public class JdbcBasedVehiculeRepository implements VehiculeRepository{
     public Vehicule[] getAll(){
        return new Vehicule[0];
    };

     public Vehicule findById(int idVehicule) {
        return null;
    }
    
}

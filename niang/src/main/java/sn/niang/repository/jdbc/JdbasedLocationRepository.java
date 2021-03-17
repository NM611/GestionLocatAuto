package sn.niang.repository.jdbc;

import sn.niang.domain.Location;
import sn.niang.domain.Vehicule;
import sn.niang.repository.LocationRepository;

public class JdbasedLocationRepository implements LocationRepository {
    public Location[] getAll(){
        return new Location[0];
    };

     public Location findById(int idUser) {
        return null;
    }

    public Location[] getAllByVehicule(Vehicule vehicule) {
        return new Location[0];
    } 
}

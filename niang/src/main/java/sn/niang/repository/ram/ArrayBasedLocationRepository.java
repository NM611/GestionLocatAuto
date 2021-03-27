package sn.niang.repository.ram;

import sn.niang.domain.*;
import sn.niang.repository.LocationRepository;

public class ArrayBasedLocationRepository implements LocationRepository {
    public static final Location[] LOCATIONS = {
        new Location(1, "16-03-2021","3mois",new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),new Vehicule(2, "VEH8745",new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),new Description(2,"Toyota","Rouge",4))),

    };

    public Location[] getAll(){
        return LOCATIONS;
    }

    public Location findById(int idLocation) {
        return null;
    }

    public Location[] getAllByVehicule(Vehicule vehicule) {
        return new Location[0];
    }
}

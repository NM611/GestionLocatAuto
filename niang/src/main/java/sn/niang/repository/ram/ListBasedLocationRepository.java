package sn.niang.repository.ram;

import sn.niang.domain.*;

public class ListBasedLocationRepository {

    public static final Location[] LOCATIONS = {
        //new Location(1, "16-03-2021","3mois",new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),new Vehicule(2, "VEH8745",new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),new Description(2,"Toyota","Rouge",4)),

    };

    public Location[] getAll(){
        return LOCATIONS;
    }

}

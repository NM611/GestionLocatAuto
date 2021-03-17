package sn.niang.repository.ram;

import sn.niang.domain.Description;
import sn.niang.domain.Profil;
import sn.niang.domain.User;
import sn.niang.domain.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class ListBasedVehiculeRepository {
    private final List<Vehicule> vehicules;

    public ListBasedVehiculeRepository() {
        this.vehicules = new ArrayList<Vehicule>();
    }

    public Vehicule[] getAll(){
        vehicules.add(new Vehicule(1, "VEH5643",new User(1, "Mohamed NIANG", "770035321", "Ouakam", "niang@vie.sn", "niang", "passer", new Profil(1, "Admin")),new Description(1,"Ford","Grise",4)));
        vehicules.add(new Vehicule(2, "VEH8745",new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),new Description(2,"Toyota","Rouge",4) ));
        return vehicules.toArray(new Vehicule[0]);
    }


    public Vehicule findById(int idVehicule) {
        return null;
    }
}

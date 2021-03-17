package sn.niang.repository.ram;

import sn.niang.domain.Description;
import sn.niang.domain.Profil;
import sn.niang.domain.User;
import sn.niang.domain.Vehicule;

public class ArrayBasedVehiculeRepository {
    public static final Vehicule[] VEHICULES = {
        new Vehicule(1, "VEH5643",new User(1, "Mohamed NIANG", "770035321", "Ouakam", "niang@vie.sn", "niang", "passer", new Profil(1, "Admin")),new Description(1,"Ford","Grise",4)),
        new Vehicule(2, "VEH8745",new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),new Description(2,"Toyota","Rouge",4)),
    };

    public Vehicule[] getAll(){
        return VEHICULES;
    }

    public Vehicule findById(int idVehicule){
        for (int i = 0; i < VEHICULES.length; i++) {
            if(idVehicule == VEHICULES[i].getId()){
                return VEHICULES[i];
            }
        }
        return null;
    }

}

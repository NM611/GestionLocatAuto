package sn.niang.repository.ram;

import sn.niang.domain.Profil;
import sn.niang.repository.ProfilRepository;

public class ArrayBasedProfilRepository implements ProfilRepository{

    public static final Profil[] PROFILS = {
        new Profil(1, "Admin"),
        new Profil(2, "Client"),
    };

    public Profil[] getAll(){
        return PROFILS;
    }

    public Profil findById(int id){
        for (int i = 0; i < PROFILS.length; i++) {
            if(id == PROFILS[i].getId()){
                return PROFILS[i];
            }
        }
        return null;
    }
}

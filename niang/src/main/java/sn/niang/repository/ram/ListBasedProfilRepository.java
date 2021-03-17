package sn.niang.repository.ram;

import sn.niang.repository.ProfilRepository;
import sn.niang.domain.Profil;

import java.util.ArrayList;
import java.util.List;

public class ListBasedProfilRepository implements ProfilRepository{
    private final List<Profil> profils;

    public ListBasedProfilRepository() {
        this.profils = new ArrayList<Profil>();
    }


    public Profil[] getAll(){
        profils.add(new Profil(1, "Admin"));
        profils.add(new Profil(1, "Client"));
        return profils.toArray(new Profil[0]);
    }


    public Profil findById(int idProfil) {
        return null;
    }
}

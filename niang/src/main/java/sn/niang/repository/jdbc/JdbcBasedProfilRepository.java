package sn.niang.repository.jdbc;

import sn.niang.domain.Profil;
import sn.niang.repository.ProfilRepository;

public class JdbcBasedProfilRepository implements ProfilRepository{

    public Profil[] getAll(){
        return new Profil[0];
    };

     public Profil findById(int idProfil) {
        return null;
    }
}

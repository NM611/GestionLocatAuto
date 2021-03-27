package sn.niang.repository.jdbc;

import sn.niang.domain.Profil;
import sn.niang.repository.ProfilRepository;

public class JdbcBasedProfilRepository implements ProfilRepository{
    private final DataSource dataSource;

    public JdbcBasedProfilRepository(DataSource dataSource){this.dataSource=dataSource;}
    public Profil[] getAll(){
        try {

        }catch (Exception ex){

        }
        return new Profil[0];
    };

     public Profil findById(int idProfil) {
        return null;
    }
}

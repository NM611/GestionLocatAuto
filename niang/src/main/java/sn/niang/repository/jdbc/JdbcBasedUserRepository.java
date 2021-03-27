package sn.niang.repository.jdbc;

import sn.niang.domain.Profil;
import sn.niang.domain.User;
import sn.niang.repository.UserRepository;

public class JdbcBasedUserRepository implements UserRepository{
    private final DataSource dataSource;

    public JdbcBasedUserRepository(DataSource dataSource){this.dataSource=dataSource;}
    public User[] getAllByProfil(Profil profil){
        try {

        }catch (Exception e){

        }
        return new User[0];
    }

    public User[] getAll() {
        return new User[0];
    }

    ;

     public User findById(int idUser) {
        return null;
    }
}

package sn.niang.repository.jdbc;

import sn.niang.domain.Profil;
import sn.niang.domain.User;
import sn.niang.repository.UserRepository;

public class JdbcBasedUserRepository implements UserRepository{
    public User[] getAllByProfil(Profil profil){
        return new User[0];
    };

     public User findById(int idUser) {
        return null;
    }
}

package sn.niang.repository.ram;

import sn.niang.domain.Profil;
import sn.niang.domain.User;
import sn.niang.repository.UserRepository;

public class ArrayBasedUserRepository implements UserRepository{
        public static final User[] USERS = {
        new User(1, "Mohamed NIANG", "770035321", "Ouakam", "niang@vie.sn", "niang", "passer", new Profil(1, "Admin")),
            new User(2, "Aicha Gueye", "779876534", "Ouakam", "gueye@vie.sn", "gueye", "passer", new Profil(1, "Client")),
    };

    public User[] getAllByProfil(Profil p){
        return USERS;
    }

    public User[] getAll() {
        return USERS;
    }

    public User findById(int id){
        for (int i = 0; i < USERS.length; i++) {
            if(id == USERS[i].getId()){
                return USERS[i];
            }
        }
        return null;
    }
}

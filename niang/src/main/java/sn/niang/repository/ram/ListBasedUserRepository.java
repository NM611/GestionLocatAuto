package sn.niang.repository.ram;

import sn.niang.domain.Profil;
import sn.niang.domain.User;
import sn.niang.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedUserRepository implements UserRepository{
    private final List<User> users;

    public ListBasedUserRepository() {
        this.users = new ArrayList<User>();
    }


    public User[] getAllByProfil(Profil p){
        users.add(new  User(1, "Mohamed NIANG", "770035321", "Ouakam", "niang@vie.sn", "niang", "passer", p));
        return users.toArray(new User[0]);
    }


    public User findById(int idUser) {
        return null;
    }
}

package sn.niang.repository;

import sn.niang.domain.Profil;
import sn.niang.domain.User;

public interface UserRepository { 
    User[] getAllByProfil(Profil profile);
    User findById(int idUser);
}

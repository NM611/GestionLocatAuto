package sn.niang.repository;

import sn.niang.domain.Profil;

public interface ProfilRepository {
    Profil[] getAll();
    Profil findById(int idProfil);
}

package sn.niang.service;

import sn.niang.domain.Location;
import sn.niang.domain.User;
import sn.niang.domain.Vehicule;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeUsers(User[] users);

    void afficherListeLocations(Location[] locations, User user);

    void afficherListeVehicules(Vehicule[] vehicules);

}

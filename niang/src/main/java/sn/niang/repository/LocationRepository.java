package sn.niang.repository;

import sn.niang.domain.Location;
import sn.niang.domain.Vehicule;

public interface LocationRepository {
    Location[] getAll();
    Location findById(int idLocation);
    Location[] getAllByVehicule(Vehicule vehicule);
}

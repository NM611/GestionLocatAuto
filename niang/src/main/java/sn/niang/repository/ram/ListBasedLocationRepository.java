package sn.niang.repository.ram;

import sn.niang.domain.*;
import sn.niang.repository.LocationRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedLocationRepository implements LocationRepository {
    private final List<Location> locations;

    public ListBasedLocationRepository() {
        this.locations = new ArrayList<Location>();
    }

    public Location[] getAll() {
        return new Location[0];
    }

    public Location findById(int idLocation) {
        return null;
    }

    public Location[] getAllByVehicule(Vehicule vehicule) {
        return new Location[0];
    }
}

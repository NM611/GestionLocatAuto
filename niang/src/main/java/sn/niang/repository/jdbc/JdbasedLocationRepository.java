package sn.niang.repository.jdbc;

import sn.niang.domain.Location;
import sn.niang.domain.Vehicule;
import sn.niang.repository.LocationRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbasedLocationRepository implements LocationRepository {
    private final DataSource dataSource;

    public JdbasedLocationRepository(DataSource dataSource){this.dataSource=dataSource;}

    public Location[] getAll(){
        String query="SELECT * FROM Location";

        List<Location> locations=new ArrayList<Location>();
        try {

        }catch (Exception ex){

        }
        return new Location[0];
    };

     public Location findById(int idUser) {
        return null;
    }

    public Location[] getAllByVehicule(Vehicule vehicule) {
        return new Location[0];
    }
}

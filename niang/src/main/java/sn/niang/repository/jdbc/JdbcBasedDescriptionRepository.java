package sn.niang.repository.jdbc;

import sn.niang.domain.Description;
import sn.niang.repository.DescriptionRepository;

public class JdbcBasedDescriptionRepository implements DescriptionRepository{
 public Description[] getAll(){
        return new Description[0];
    };

     public Description findById(int idDescription) {
        return null;
    }
}

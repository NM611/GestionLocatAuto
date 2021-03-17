package sn.niang.repository;

import sn.niang.domain.Description;

public interface DescriptionRepository {
    Description[] getAll();
    Description findById(int idDescription);
}

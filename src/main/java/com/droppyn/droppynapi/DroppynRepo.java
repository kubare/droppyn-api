package com.droppyn.droppynapi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroppynRepo extends MongoRepository<Droppyn, String> {
}

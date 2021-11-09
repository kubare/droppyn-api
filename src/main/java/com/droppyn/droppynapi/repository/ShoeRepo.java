package com.droppyn.droppynapi.repository;

import com.droppyn.droppynapi.models.Shoe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeRepo extends MongoRepository<Shoe, String> {
}

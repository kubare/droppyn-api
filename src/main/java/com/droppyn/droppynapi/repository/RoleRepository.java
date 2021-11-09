package com.droppyn.droppynapi.repository;

import java.util.Optional;

import com.droppyn.droppynapi.models.ERole;
import com.droppyn.droppynapi.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}

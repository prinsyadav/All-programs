package org.prince.simplebackend.repo;

import org.prince.simplebackend.model.UsersData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <UsersData, Integer>{

}

package com.example.mipeacebackendspringboot;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT u.firstName, u.middleName, u.lastName FROM User u WHERE u.cacID = :cacid")
    User findByCacID(@Param("cacid") String cacid);
}

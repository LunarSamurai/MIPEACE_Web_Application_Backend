package com.example.mipeacebackendspringboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TestOrderRepository extends JpaRepository<TestOrder, Long> {
    
}


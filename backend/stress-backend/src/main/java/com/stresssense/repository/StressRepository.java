package com.stresssense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stresssense.model.StressRecord;

@Repository
public interface StressRepository extends JpaRepository<StressRecord, Long> {

    // ✅ Fetch records for specific user
    List<StressRecord> findByEmail(String email);

}
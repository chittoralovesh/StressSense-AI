package com.stresssense.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stresssense.model.StressRecord;
import com.stresssense.repository.StressRepository;

@Service
public class StressService {

    private final StressRepository repository;

    public StressService(StressRepository repository) {
        this.repository = repository;
    }

    // 🔥 USER HISTORY
    public List<StressRecord> getRecordsByEmail(String email){
        return repository.findByEmail(email);
    }

    // SAVE
    public StressRecord saveRecord(StressRecord record){
        return repository.save(record);
    }

    // OPTIONAL
    public List<StressRecord> getAllRecords(){
        return repository.findAll();
    }
}
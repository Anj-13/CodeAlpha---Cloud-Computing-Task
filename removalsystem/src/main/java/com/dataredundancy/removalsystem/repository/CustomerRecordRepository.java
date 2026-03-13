package com.dataredundancy.removalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataredundancy.removalsystem.model.CustomerRecord;

@Repository
public interface CustomerRecordRepository extends JpaRepository<CustomerRecord, Long> {
    
}
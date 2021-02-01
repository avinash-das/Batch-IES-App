package com.ashokit.batch.entity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.batch.entity.BatchRunDetails;

public interface BatchRunDetailsRepo extends JpaRepository<BatchRunDetails, Serializable> {

}

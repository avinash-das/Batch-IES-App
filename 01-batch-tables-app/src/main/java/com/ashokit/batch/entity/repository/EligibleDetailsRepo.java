package com.ashokit.batch.entity.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.batch.entity.EligiblityDetails;

public interface EligibleDetailsRepo extends JpaRepository<EligiblityDetails, Serializable> {

}

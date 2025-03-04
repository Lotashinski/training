package com.github.lotashinski.training.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.lotashinski.training.api.entity.TrainingCycle;

public interface TrainingCycleRepository extends JpaRepository<TrainingCycle, UUID> {
	
}

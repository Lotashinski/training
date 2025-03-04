package com.github.lotashinski.training.api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "training_objectives")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TrainingObjectives {

	@Id
	@EqualsAndHashCode.Include
	private UUID id = UUID.randomUUID();
	
	
	@ManyToOne
	@JoinColumn(name = "training_stage_id", 
				nullable = false,
				foreignKey = @ForeignKey(name = "FK_TRAINING_OBJECTIVES_TO_TRAINING_STAGE"))
	private TrainingStage trainingStage;
	
	
	@Column(name = "description", nullable = false)
	private String description;
	
}

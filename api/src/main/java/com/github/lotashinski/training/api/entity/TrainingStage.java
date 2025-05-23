package com.github.lotashinski.training.api.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "training_stage")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TrainingStage {

	@Id
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.PACKAGE)
	private UUID id = UUID.randomUUID();
	
	
	@ManyToOne
	@JoinColumn(name = "training_cucle_id", 
				nullable = false,
				foreignKey = @ForeignKey(name = "FK_TRAINING_STAGE_TO_TRAINING_CYCLE"))
	private TrainingCycle trainingCucle;
	
	
	@Column(name = "period")
	private Period period;
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@OneToMany(mappedBy = "trainingStage", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<TrainingObjectives> objectives = new ArrayList<>();
	
	@OneToMany(mappedBy = "trainingStage", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<ExerciseVolume> volumes = new ArrayList<>();
	
}

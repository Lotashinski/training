package com.github.lotashinski.training.api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "exercise_volume")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExerciseVolume {

	@Id
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.PACKAGE)
	private UUID id = UUID.randomUUID();
	
	
	@ManyToOne
	@JoinColumn(name = "training_stage_id", 
				nullable = false,
				foreignKey = @ForeignKey(name = "FK_EXERCIZE_VOLUME_TO_TRAINING_STAGE"))
	private TrainingStage trainingStage;
	
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "trainings_count", nullable = false)
	private Integer trainingsCount;
	
	@Column(name = "total_volume", nullable = false)
	private Long totalVolume;
	
	@Column(name = "units", nullable = false)
	private String units;
	
}

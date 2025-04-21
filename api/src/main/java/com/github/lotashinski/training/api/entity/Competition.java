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
@Table(name = "competition")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Competition {

	@Id
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.PACKAGE)
	private UUID id = UUID.randomUUID();

	
	@ManyToOne
	@JoinColumn(name = "training_cucle_id", 
				nullable = false,
				foreignKey = @ForeignKey(name = "FK_COMPETITION_TO_TRAINING_CYCLE"))
	private TrainingCycle trainingCycle;

	
	@Column(name = "period")
	private Period period;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "description")
	private String description;
	
}

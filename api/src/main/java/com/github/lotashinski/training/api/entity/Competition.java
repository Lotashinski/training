package com.github.lotashinski.training.api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="competition")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Competition {
	
	@Id
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.PACKAGE)
	private UUID id = UUID.randomUUID();
	
	
	@ManyToOne
	@JoinColumn(name = "training_cucle_id", nullable = false)
	private TrainingCucle trainingCucle;
	
	
	@Embedded
	private Period period;
	
	@Column(name = "title", nullable = false)
	private String title;
	
}

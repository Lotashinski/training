package com.github.lotashinski.training.api.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "training_cucle")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class TrainingCycle {

	@Id
	@EqualsAndHashCode.Include
	@Setter(value = AccessLevel.PACKAGE)
	private UUID id = UUID.randomUUID();
	
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Embedded
	private Period period;
	
	@OneToMany(mappedBy = "trainingCycle", cascade = CascadeType.ALL)
	@OrderBy("period.start ASC")
	@Setter(value = AccessLevel.PACKAGE)
	private List<Competition> competitions = new ArrayList<>();
	
	@OneToMany(mappedBy = "trainingCucle", cascade = CascadeType.ALL)
	@OrderBy("period.start ASC")
	@Setter(value = AccessLevel.PACKAGE)
	private List<TrainingStage> trainingStages = new ArrayList<>();
	
}

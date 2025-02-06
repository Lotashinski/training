package com.github.lotashinski.training.api.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.lotashinski.training.api.dto.TrainingObjectiveDto;
import com.github.lotashinski.training.api.dto.TrainingObjectiveItemDto;
import com.github.lotashinski.training.api.dto.TrainingObjectiveSaveDto;

@RestController
@RequestMapping("/training_objectives")
public class TrainingObjectiveController {
	
	@GetMapping
	public ResponseEntity<List<? extends TrainingObjectiveItemDto>> readAll(@RequestParam UUID trainingStage) {
		// TODO method not implemented
		return null;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<TrainingObjectiveDto> create(@RequestParam UUID trainingStage, @RequestBody TrainingObjectiveSaveDto dto) {
		// TODO method not implemented
		return null;
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<TrainingObjectiveDto> read(@PathVariable UUID id) {
		// TODO method not implemented
		return null;
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<TrainingObjectiveDto> update(@PathVariable UUID id, @RequestBody TrainingObjectiveSaveDto dto) {
		// TODO method not implemented
		return null;
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable UUID id) {
		// TODO method not implemented
	}
	
}

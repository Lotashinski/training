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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.lotashinski.training.api.dto.TrainingStageDto;
import com.github.lotashinski.training.api.dto.TrainingStageItemDto;
import com.github.lotashinski.training.api.dto.TrainingStageSaveDto;

@RestController
@RequestMapping("/training_stages")
public class TrainingStageController {
	
	@GetMapping
	public ResponseEntity<List<? extends TrainingStageItemDto>> getAll() {
		// TODO method not implemented
		return null;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<TrainingStageDto> save(@RequestBody TrainingStageSaveDto dto) {
		// TODO method not implemented
		return null;
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<TrainingStageDto> get(@PathVariable UUID id) {
		// TODO method not implemented
		return null;
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<TrainingStageDto> update(@PathVariable UUID id, @RequestBody TrainingStageSaveDto dto) {
		// TODO method not implemented
		return null;
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable UUID id) {
		// TODO method not implemented
	}
	
}

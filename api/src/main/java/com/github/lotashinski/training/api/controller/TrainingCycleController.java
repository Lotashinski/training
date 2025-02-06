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

import com.github.lotashinski.training.api.dto.TrainingCycleDto;
import com.github.lotashinski.training.api.dto.TrainingCycleItemDto;
import com.github.lotashinski.training.api.dto.TrainingCycleSaveDto;

@RestController
@RequestMapping("/training_cycles")
public class TrainingCycleController {
	
	@GetMapping
	public ResponseEntity<List<? extends TrainingCycleItemDto>> getAll() {
		// TODO method not implemented
		return null;
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<TrainingCycleDto> save(@RequestBody TrainingCycleSaveDto dto) {
		// TODO method not implemented
		return null;
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<TrainingCycleDto> get(@PathVariable UUID id) {
		// TODO method not implemented
		return null;
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<TrainingCycleDto> update(@PathVariable UUID id, @RequestBody TrainingCycleSaveDto dto) {
		// TODO method not implemented
		return null;
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable UUID id) {
		// TODO method not implemented
	}
	
}

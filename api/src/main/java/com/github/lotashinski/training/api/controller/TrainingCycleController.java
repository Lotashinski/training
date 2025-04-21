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
import com.github.lotashinski.training.api.service.TrainingCycleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/training_cycles")
public class TrainingCycleController {
	
	private final TrainingCycleService trainingCycleService;
	
	
	@GetMapping
	public ResponseEntity<List<? extends TrainingCycleItemDto>> readAll() {
		return ResponseEntity.ok(trainingCycleService.getAll());
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<TrainingCycleDto> create(@RequestBody TrainingCycleSaveDto dto) {
		return new ResponseEntity<>(trainingCycleService.save(dto), HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<TrainingCycleDto> read(@PathVariable UUID id) {
		return ResponseEntity.ok(trainingCycleService.findById(id));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<TrainingCycleDto> update(@PathVariable UUID id, @RequestBody TrainingCycleSaveDto dto) {
		return ResponseEntity.ok(trainingCycleService.update(id, dto));
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable UUID id) {
		trainingCycleService.delete(id);
	}
	
}

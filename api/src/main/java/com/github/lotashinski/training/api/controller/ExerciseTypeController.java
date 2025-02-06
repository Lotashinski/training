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

import com.github.lotashinski.training.api.dto.ExerciseVolumeDto;
import com.github.lotashinski.training.api.dto.ExerciseVolumeSaveDto;


@RestController
@RequestMapping(path = "/excercise_types")
public class ExerciseTypeController {
	
	@GetMapping
	public ResponseEntity<List<? extends ExerciseVolumeDto>> readAll(@RequestParam UUID trainingStageId) {
		return null;
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<ExerciseVolumeDto> create(@RequestParam UUID trainingStageId, @RequestBody ExerciseVolumeSaveDto dto) {
		return null;
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ExerciseVolumeDto> get(@PathVariable UUID id) {
		return null;
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<ExerciseVolumeDto> update(@PathVariable UUID id, @RequestBody ExerciseVolumeSaveDto dto) {
		return null;
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable UUID id) {
		
	}
	
}

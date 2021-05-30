package com.droege.javafitnesstracker.services;

import com.droege.javafitnesstracker.models.Exercise;
import com.droege.javafitnesstracker.repositories.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> list() {
        return exerciseRepository.findAll();
    }
}

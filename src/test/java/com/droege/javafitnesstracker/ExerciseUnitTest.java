package com.droege.javafitnesstracker;


import com.droege.javafitnesstracker.models.Exercise;
import com.droege.javafitnesstracker.services.ExerciseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExerciseUnitTest {

    @Autowired
    private ExerciseService exerciseService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Exercise> exercises = exerciseService.list();

        Assert.assertEquals(exercises.size(), 8);
    }
}

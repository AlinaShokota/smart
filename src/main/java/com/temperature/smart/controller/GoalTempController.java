package com.temperature.smart.controller;

import com.temperature.smart.model.GoalTemperature;
import com.temperature.smart.service.GoalTemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@RestController
@RequestMapping("/setTemp")
@CrossOrigin(origins = "*")
public class GoalTempController {

    @Autowired
    GoalTemperatureService goalTemperatureService;

    @PostMapping("/save")
    public ResponseEntity setGoalTemp(@RequestBody Float temp){
        System.out.println("****************************8");
        System.out.println(temp);
        GoalTemperature goalTemperature = new GoalTemperature(LocalDate.now(), temp, LocalTime.now());
        goalTemperatureService.addGoalTemp(goalTemperature);
        return ResponseEntity.ok().build();
    }

}

package com.temperature.smart.service;

import com.temperature.smart.model.GoalTemperature;
import com.temperature.smart.repo.GoalTemperatureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalTemperatureServiceImpl implements GoalTemperatureService{

    @Autowired
    GoalTemperatureRepo goalTemperatureRepo;

    @Override
    public void addGoalTemp(GoalTemperature goalTemperature) {
        goalTemperatureRepo.save(goalTemperature);
    }
}

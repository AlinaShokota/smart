package com.temperature.smart.repo;


import com.temperature.smart.model.GoalTemperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalTemperatureRepo extends JpaRepository<GoalTemperature, Integer> {
}

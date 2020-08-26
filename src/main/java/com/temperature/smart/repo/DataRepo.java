package com.temperature.smart.repo;


import com.temperature.smart.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<Data, Integer> {
}

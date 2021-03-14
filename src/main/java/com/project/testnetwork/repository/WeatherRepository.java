package com.project.testnetwork.repository;

import com.project.testnetwork.model.InfoWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeatherRepository extends JpaRepository<InfoWeather, Long> {
    List<InfoWeather> findByCityIgnoreCase(String city);
}

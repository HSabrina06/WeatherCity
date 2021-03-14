package com.project.testnetwork.controller;

import com.project.testnetwork.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @PostMapping("/weather")
    public String getWeatherCity(@RequestParam String city, Model model) {
        return weatherService.weatherCity(city, model);
    }

}
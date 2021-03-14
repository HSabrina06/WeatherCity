package com.project.testnetwork.client;


import com.project.testnetwork.model.CityWeather;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "WeitherClient", url = "http://api.openweathermap.org/data/2.5/weather?appid=75630d06d0dc7092d5dbcc35bfbe21f1")

public interface WeatherClient {

    @GetMapping(value = "/", produces = "application/json")
    public CityWeather searchCurrentWeathers(@RequestParam String q);


}
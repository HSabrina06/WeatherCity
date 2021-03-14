package com.project.testnetwork.service;

import com.project.testnetwork.client.WeatherClient;
import com.project.testnetwork.model.CityWeather;
import com.project.testnetwork.model.InfoWeather;
import com.project.testnetwork.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import java.util.Date;

@Service
public class WeatherService {
    @Autowired
    WeatherClient weatherClient;

    @Autowired
    WeatherRepository weatherRepository;

    public String weatherCity(String city, Model model) {
        CityWeather cityWeather;

        try {
            cityWeather = weatherClient.searchCurrentWeathers(city);
        } catch (Exception e) {
            model.addAttribute("error", "Error :  City Not Found !!");
            return "index";
        }

        // get data successful
        InfoWeather infoWeather = new InfoWeather(
                cityWeather.getName(),
                cityWeather.getWeather().get(0).getDescription(),
                cityWeather.getMain().getTemp(),
                cityWeather.getMain().getHumidity(),
                cityWeather.getWind().getSpeed(),
                cityWeather.getWind().getDeg(),
                cityWeather.getWeather().get(0).getMain(),
                cityWeather.getWeather().get(0).getIcon(),
                cityWeather.getSys().getCountry(),
                new Date(Integer.parseInt(cityWeather.getDt()) * 1000)
        );

        weatherRepository.save(infoWeather);

        model.addAttribute("weather_data", infoWeather);
        model.addAttribute("weather_data_city", weatherRepository.findByCityIgnoreCase(city));
//        return "redirect:/weather";
        return "index";
    }
}

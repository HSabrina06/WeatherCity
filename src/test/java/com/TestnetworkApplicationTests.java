package com;/*
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;*/

import com.project.testnetwork.client.WeatherClient;
import com.project.testnetwork.model.CityWeather;
import org.springframework.beans.factory.annotation.Autowired;

//@SpringBootTest
class TestnetworkApplicationTests {
    @Autowired
    WeatherClient weatherClient;
    // @Test
    void contextLoads() {
      /*  public Object index() {
            try {
                CityWeather cityWeather = weatherClient.searchCurrentWeathers("Istanbul");
                System.out.println("==========> " + cityWeather);
                return weatherClient.searchCurrentWeathers("Istanbul");
            } catch (Exception e) {
                System.out.println("================> ddddddddddddddddddddddddddd");
                return "error";
            }
        }*/
    }

}

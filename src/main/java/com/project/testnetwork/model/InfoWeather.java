package com.project.testnetwork.model;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel
public class InfoWeather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String description;
    private double temperature;
    private String humidity;
    private String speed;
    private String deg;
    private String main;
    private String icon;
    private String country;
    private Date Date;

    public InfoWeather(String city, String description, String temperature, String humidity, String speed, String deg, String main, String icon, String country, Date date) {
        this.city = city;
        this.description = description;
        this.temperature = Double.parseDouble(temperature);
        this.humidity = humidity;
        this.speed = speed;
        this.deg = deg;
        this.main = main;
        this.icon = icon;
        this.country = country;
        Date = date;
    }
}

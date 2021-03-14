package com.project.testnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Main {

    private String temp;
    private String feels_like;
    private String temp_min;
    private String temp_max;
    private String pressure;
    private String humidity;

    @Override
    public String toString() {
        return "Main{" +
                "temp='" + temp + '\'' +
                ", feels_like='" + feels_like + '\'' +
                ", temp_min=" + temp_min +
                ", temp_max='" + temp_max + '\'' +
                ", pressure='" + pressure + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }
}

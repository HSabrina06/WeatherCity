package com.project.testnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Weather {
    private String id;
    private String main;
    private String description;
    private String icon;

    @Override
    public String toString() {
        return "Weather{" +
                "id='" + id + '\'' +
                ", main='" + main + '\'' +
                ", description=" + description +
                ", icon='" + icon + '\'' +
                '}';
    }
}

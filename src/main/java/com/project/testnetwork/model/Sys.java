package com.project.testnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Sys {

    private String type;
    private String id;
    private String country;
    private String sunrise;
    private String sunset;

    @Override
    public String toString() {
        return "Sys{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", sunrise='" + sunrise + '\'' +
                ", sunset='" + sunset + '\'' +
                '}';
    }
}

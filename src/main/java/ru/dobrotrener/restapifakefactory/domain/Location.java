package ru.dobrotrener.restapifakefactory.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private String street;
    private String city;
    private String state;
    private String postcode;
}
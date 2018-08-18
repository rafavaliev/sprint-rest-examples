package ru.dobrotrener.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExpirationDate implements Serializable {
    public String date;
    public Integer timezoneType;
    public String timezone;
}
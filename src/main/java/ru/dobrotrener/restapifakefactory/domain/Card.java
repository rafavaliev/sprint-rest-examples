package ru.dobrotrener.restapifakefactory.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String type;
    private String number;
    private String iban;
    private String swift;
    private Date expirationDate;
}
package ru.dobrotrener.restapifakefactory.api.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Card implements Serializable {
    public String type;
    public String number;
    public ExpirationDate expirationDate;
    public String iban;
    public String swift;
}
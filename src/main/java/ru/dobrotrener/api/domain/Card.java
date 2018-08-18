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
public class Card implements Serializable {
    public String type;
    public String number;
    public ExpirationDate expirationDate;
    public String iban;
    public String swift;
}
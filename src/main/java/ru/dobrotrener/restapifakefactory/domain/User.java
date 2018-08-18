package ru.dobrotrener.restapifakefactory.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Name name;
    private Gender gender;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private Language language;
    private Currency currency;
}
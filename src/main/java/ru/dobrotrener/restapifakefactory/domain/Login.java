package ru.dobrotrener.restapifakefactory.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha256;
}
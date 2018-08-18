package ru.dobrotrener.restapifakefactory.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class UserData {
    private List<User> data;
}

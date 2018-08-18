package ru.dobrotrener.restapifakefactory.service;

import ru.dobrotrener.api.domain.UserData;

public interface ApiService {
    UserData getUsers(Integer limit);
}

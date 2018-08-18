package ru.dobrotrener.restapifakefactory.service;

import ru.dobrotrener.restapifakefactory.api.domain.UserData;

public interface ApiService {
    UserData getUsers(Integer limit);
}

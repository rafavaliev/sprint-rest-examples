package ru.dobrotrener.restapifakefactory.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.dobrotrener.restapifakefactory.api.domain.UserData;

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public UserData getUsers(Integer limit) {
        UserData data = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
        return data;
    }
}

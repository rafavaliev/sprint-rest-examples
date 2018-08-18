package ru.dobrotrener.restapifakefactory.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.dobrotrener.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
    Flux<User> getUsers(Mono<Integer> limit);
}

package ru.dobrotrener.restapifakefactory.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.dobrotrener.api.domain.User;
import ru.dobrotrener.api.domain.UserData;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getListOfUsers() {
        List<User> list = apiService.getUsers(1);
        assertEquals(2, list.size());
        log.info(list.toString());
    }

    @Test
    public void getFluxUsers() {
        Flux<User> userFlux = apiService.getUsers(Mono.just(Integer.valueOf(1)));
        List<User> list = userFlux.collectList().block();
        assertNotNull(list);
        assertEquals(2, list.size());
        log.info(list.toString());
    }
}
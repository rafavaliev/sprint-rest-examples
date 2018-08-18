package ru.dobrotrener.restapifakefactory.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.dobrotrener.restapifakefactory.api.domain.User;
import ru.dobrotrener.restapifakefactory.api.domain.UserData;

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
    public void getUsers() {
        UserData userData = apiService.getUsers(1);
        List<User> list = userData.getData();
        assertEquals(2, list.size());
        log.info(userData.toString());
    }
}
package ru.dobrotrener;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class RestTemplateExamples {

    public static final String API_ROOT = "https://api.predic8.de:443/shop";

    @Test
    public void getCategories() throws  Exception {
        String apiUrl = API_ROOT + "/categories/";

        RestTemplate restTemplate = new RestTemplate();

        JsonNode jsonNode = restTemplate.getForObject(apiUrl, JsonNode.class);
        logJsonNode(jsonNode);
    }

    @Test
    public void getCustomers() throws  Exception {
        String apiUrl = API_ROOT + "/customers/";

        RestTemplate restTemplate = new RestTemplate();

        JsonNode jsonNode = restTemplate.getForObject(apiUrl, JsonNode.class);
        logJsonNode(jsonNode);
    }

    @Test
    public void createCustomer() throws  Exception {
        String apiUrl = API_ROOT + "/customers/";

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> postMap = new HashMap<>();
        postMap.put("firstname", "Joe");
        postMap.put("lastname", "Buck");

        JsonNode jsonNode = restTemplate.postForObject(apiUrl, postMap, JsonNode.class);
        logJsonNode(jsonNode);
    }

    @Test
    public void updateCustomer() throws  Exception {
        String apiUrl = API_ROOT + "/customers/";

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> postMap = new HashMap<>();
        postMap.put("firstname", "Joe");
        postMap.put("lastname", "Buck");
        JsonNode jsonNodePost = restTemplate.postForObject(apiUrl, postMap, JsonNode.class);
        logJsonNode(jsonNodePost);

        String customerUrl = jsonNodePost.get("customer_url").textValue();
        String id = customerUrl.split("/")[3];


        Map<String, Object> putMap = new HashMap<>();
        putMap.put("firstname", "Joe 2");
        putMap.put("lastname", "Buck 2");
        restTemplate.put(apiUrl + id, putMap, JsonNode.class);

        JsonNode jsonNodePut = restTemplate.getForObject(apiUrl + id, JsonNode.class);
        logJsonNode(jsonNodePut);
    }

    @Test(expected = HttpClientErrorException.class)
    public void deleteCustomer() throws  Exception {
        String apiUrl = API_ROOT + "/customers/";

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> postMap = new HashMap<>();
        postMap.put("firstname", "Joe");
        postMap.put("lastname", "Buck");
        JsonNode jsonNodePost = restTemplate.postForObject(apiUrl, postMap, JsonNode.class);
        logJsonNode(jsonNodePost);

        String customerUrl = jsonNodePost.get("customer_url").textValue();
        String id = customerUrl.split("/")[3];



        restTemplate.delete(apiUrl + id);


        JsonNode jsonNodePut = restTemplate.getForObject(apiUrl + id, JsonNode.class);
        logJsonNode(jsonNodePut);
    }


    private void logJsonNode(JsonNode jsonNode) {
        log.info("Response:");
        log.info(jsonNode.toString());
    }
}

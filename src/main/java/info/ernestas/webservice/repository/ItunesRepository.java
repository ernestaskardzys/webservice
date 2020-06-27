package info.ernestas.webservice.repository;

import info.ernestas.webservice.model.resource.ItunesPageResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ItunesRepository {

    public static final String SEARCH_PATH = "search?term=";
    private final String baseUrl;

    private final RestTemplate restTemplate;

    public ItunesRepository(@Value("${itunes.baseUrl}") String baseUrl, RestTemplate restTemplate) {
        this.baseUrl = baseUrl;
        this.restTemplate = restTemplate;
    }

    public ItunesPageResource getSongs(String name) {
        String url = baseUrl + SEARCH_PATH + name;

        return restTemplate.getForObject(url, ItunesPageResource.class);
    }
}

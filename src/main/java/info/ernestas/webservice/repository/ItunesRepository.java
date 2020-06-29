package info.ernestas.webservice.repository;

import info.ernestas.webservice.config.properties.ItunesProperties;
import info.ernestas.webservice.model.resource.ItunesPageResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@RequiredArgsConstructor
public class ItunesRepository {

    private static final String SEARCH_PATH = "search?term=";

    private final ItunesProperties itunesProperties;

    private final RestTemplate restTemplate;

    public ItunesPageResource getSongs(String name) {
        String url = itunesProperties.getBaseUrl() + SEARCH_PATH + name;

        return restTemplate.getForObject(url, ItunesPageResource.class);
    }
}

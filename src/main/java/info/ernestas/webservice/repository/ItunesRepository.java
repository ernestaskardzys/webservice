package info.ernestas.webservice.repository;

import info.ernestas.webservice.config.properties.ItunesProperties;
import info.ernestas.webservice.model.resource.ItunesPageResource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ItunesRepository {

    private static final String SEARCH_PATH = "search?term=";

    private final ItunesProperties itunesProperties;

    private final RestTemplate restTemplate;

    @Cacheable("songs")
    public ItunesPageResource getSongs(String name) {
        log.info("Calling iTunes service...");

        String url = itunesProperties.getBaseUrl() + SEARCH_PATH + name;

        return restTemplate.getForObject(url, ItunesPageResource.class);
    }
}

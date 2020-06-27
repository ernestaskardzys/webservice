package info.ernestas.webservice.repository;

import info.ernestas.webservice.model.resource.ItunesPageResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
@RequiredArgsConstructor
public class ItunesRepository {

    private String base;

    private final RestTemplate restTemplate;

    public void setBase(String base) {
        this.base = base;
    }

    public ItunesPageResource getSongs(String name) {
        ItunesPageResource resource = restTemplate.getForObject(base + name, ItunesPageResource.class);
        return resource;
    }
}

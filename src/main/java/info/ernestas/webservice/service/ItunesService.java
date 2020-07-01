package info.ernestas.webservice.service;

import info.ernestas.webservice.mapper.ItunesMapper;
import info.ernestas.webservice.model.dto.SongDto;
import info.ernestas.webservice.model.resource.ItunesPageResource;
import info.ernestas.webservice.repository.ItunesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItunesService {

    private final ItunesRepository repository;
    private final ItunesMapper mapper;

    public List<SongDto> getSongs(String name) {
        ItunesPageResource resource = repository.getSongs(name);
        return mapper.map(resource.getResults());
    }

}

package info.ernestas.webservice.service;

import info.ernestas.webservice.model.dto.SongDto;
import info.ernestas.webservice.model.resource.ItunesPageResource;
import info.ernestas.webservice.model.resource.SongResultResource;
import info.ernestas.webservice.repository.ItunesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItunesService {

    private final ItunesRepository repository;

    public List<SongDto> getSongs(String name) {
        // TODO Extract default parameter
        repository.setBase("https://itunes.apple.com/search?term=");
        ItunesPageResource resource = repository.getSongs(name);
        SongResultResource songResultResource = resource.getResults().get(0);
        return Arrays.asList(SongDto.builder()
                .artistName(songResultResource.getArtistName())
                .trackName(songResultResource.getTrackName())
                .build());
    }

}

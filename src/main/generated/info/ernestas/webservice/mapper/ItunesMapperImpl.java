package info.ernestas.webservice.mapper;

import info.ernestas.webservice.model.dto.SongDto;
import info.ernestas.webservice.model.dto.SongDto.SongDtoBuilder;
import info.ernestas.webservice.model.resource.SongResultResource;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-01T17:18:46+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
@Component
public class ItunesMapperImpl implements ItunesMapper {

    @Override
    public List<SongDto> map(List<SongResultResource> resultResources) {
        if ( resultResources == null ) {
            return null;
        }

        List<SongDto> list = new ArrayList<SongDto>( resultResources.size() );
        for ( SongResultResource songResultResource : resultResources ) {
            list.add( songResultResourceToSongDto( songResultResource ) );
        }

        return list;
    }

    protected SongDto songResultResourceToSongDto(SongResultResource songResultResource) {
        if ( songResultResource == null ) {
            return null;
        }

        SongDtoBuilder songDto = SongDto.builder();

        songDto.artistName( songResultResource.getArtistName() );
        songDto.trackName( songResultResource.getTrackName() );

        return songDto.build();
    }
}

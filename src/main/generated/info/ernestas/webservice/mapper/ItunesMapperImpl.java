package info.ernestas.webservice.mapper;

import info.ernestas.webservice.model.dto.SongDto;
import info.ernestas.webservice.model.dto.SongDto.SongDtoBuilder;
import info.ernestas.webservice.model.resource.SongResultResource;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ItunesMapperImpl implements ItunesMapper {

    @Override
    public SongDto map(SongResultResource resultResource) {
        if ( resultResource == null ) {
            return null;
        }

        SongDtoBuilder songDto = SongDto.builder();

        songDto.artistName( resultResource.getArtistName() );
        songDto.trackName( resultResource.getTrackName() );

        return songDto.build();
    }
}

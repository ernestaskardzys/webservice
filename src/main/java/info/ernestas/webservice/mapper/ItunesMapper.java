package info.ernestas.webservice.mapper;

import info.ernestas.webservice.model.dto.SongDto;
import info.ernestas.webservice.model.resource.SongResultResource;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItunesMapper {

    SongDto map(SongResultResource resultResource);

}

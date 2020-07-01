package info.ernestas.webservice.mapper;

import info.ernestas.webservice.model.dto.SongDto;
import info.ernestas.webservice.model.resource.SongResultResource;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItunesMapper {

    List<SongDto> map(List<SongResultResource> resultResources);

}

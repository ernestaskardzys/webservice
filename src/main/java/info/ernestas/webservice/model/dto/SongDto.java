package info.ernestas.webservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class SongDto {

    private final String artistName;

    private final String trackName;

}

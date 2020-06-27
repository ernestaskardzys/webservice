package info.ernestas.webservice.model.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItunesPageResource {

    private Integer resultCount;

    @Builder.Default
    private List<SongResultResource> results = new ArrayList<>();

}

package info.ernestas.webservice.controller;

import info.ernestas.webservice.service.ItunesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class SongController {

    private final ItunesService itunesService;

    @RequestMapping("/song")
    public String getSong(@RequestParam("name") String name) {
        return itunesService.getSongs(name).get(0).getArtistName();
    }

}

package info.ernestas.webservice.controller;

import info.ernestas.webservice.repository.ItunesRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.core.env.Environment;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@AutoConfigureWireMock(port = 0)
public class SongControllerIT {

    @Autowired
    private Environment environment;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ItunesRepository repository;

    @BeforeEach
    public void setup() {
        repository.setBase("http://localhost:" + environment.getProperty("wiremock.server.port"));
    }

    @Test
    void testGetSong() throws Exception {
        mockMvc.perform(get("/song?name=Sam+Smith"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Sam Smith & Normani")));
    }

}

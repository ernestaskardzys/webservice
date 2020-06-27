package info.ernestas.webservice.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ResultTest {

    private static final String HELLO = "Hello!";

    @Test
    void testGetName() {
        Result result = new Result(HELLO);
        assertThat(result.getName(), is(HELLO));
    }

}
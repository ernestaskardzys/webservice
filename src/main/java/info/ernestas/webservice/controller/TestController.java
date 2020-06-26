package info.ernestas.webservice.controller;

import info.ernestas.webservice.model.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/hello")
    public Result sayHi() {
        log.info("Invoking Hi controller :)");
        return new Result("Hi!");
    }

}

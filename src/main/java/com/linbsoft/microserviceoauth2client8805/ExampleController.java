package com.linbsoft.microserviceoauth2client8805;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public String email(Principal principal) {
        return "Hello " + principal.getName();
    }
    @RequestMapping("/hello")
    public String emailaa(Principal principal) {
        return "Hello1 " + principal.getName();
    }
}

package net.javaguides.springboot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring boot world";
    }
}

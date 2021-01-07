package home.bruce.HttpsPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/http")
    public String test() {
        return "hello https";
    }
}

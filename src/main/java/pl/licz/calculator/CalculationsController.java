package pl.licz.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationsController {

    @GetMapping("/add/")
    public Integer add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
    @GetMapping("/subtract/")
    public Integer subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }
    @GetMapping("/multiply/")
    public Integer multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }
}

package com.tirasel.playwithcicd;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public DemoEntity sayHello(){
        return new DemoEntity("Taskia", "tiskia@gmail.com");
    }
}

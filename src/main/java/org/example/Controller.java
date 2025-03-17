package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private String[] list = new String[10];

    @GetMapping("/getCRSE")
    public String[] getString(){
        return list;
    }

    @PostMapping("/addCRSE")
    public void addCRSE(@RequestBody String CRSE) {
        list[list.length - 1] = CRSE;
    }
}
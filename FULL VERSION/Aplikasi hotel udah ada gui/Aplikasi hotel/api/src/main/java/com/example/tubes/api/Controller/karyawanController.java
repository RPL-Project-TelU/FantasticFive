package com.example.tubes.api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class karyawanController {

    @GetMapping(value = "data")
    public String getData(){
        return "Hello world";
    }
}

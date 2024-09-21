package com.apc.entjavamid40;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("convert")
public class MyController {

    @GetMapping("/convert/{unit1}/{unit2}/{value}")
    public String convert() {
        return "";
    }
}

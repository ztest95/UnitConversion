package com.apc.entjavamid40;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("convert")
public class MyController {

    /*
    * /convert/1/in/cm
    *
    * out put should be found in sample_out.json
    * */

    @GetMapping("/{value}/{unit1}/{unit2}/")
    public String convert() {
        return "";
    }

    List<String> allowedUnits = Arrays.asList("mm","cm","in","m","ft");

}

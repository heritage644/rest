package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import com.SoftwareEngineer;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/v1/softwareengineer")


public class SoftwareEngineercontroller {
    @GetMapping
    public List<SoftwareEngineer> getEngineer(){
       return List.of(
        new SoftwareEngineer( 1,"james","java"
        ), new SoftwareEngineer( 2,"Annie","java, python, golang"
        )
       );
    }

    
}

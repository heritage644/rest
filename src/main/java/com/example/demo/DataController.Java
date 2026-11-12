package com.example.demo;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController 
@RequestMapping("/api/v1/softwareengineer/")
public class DataController {
   @GetMapping
   public List<SoftwareEngineer> setENgineer(){
    return List.of (
        new SoftwareEngineer( 1,"juliano","pytorch, matplot-lib"
        ), new SoftwareEngineer( 2,"Annie","docker, Kafka,python,excel "
        )
    )
   }

    

}
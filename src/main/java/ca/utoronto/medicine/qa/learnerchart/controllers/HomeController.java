package ca.utoronto.medicine.qa.learnerchart.controllers;


import ca.utoronto.medicine.qa.learnerchart.entity.OscePdf;
import ca.utoronto.medicine.qa.learnerchart.repository.OscePdfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private OscePdfRepository repository;
    @GetMapping(path = "/")
    public String getHomePage(){

        //System.out.println("java.library.path>>>>>>>>>>>>>>>>>>>>>>>>>>"+System.getProperty("java.library.path"));
        return "Hello World, New QA for New Learner Chart!";
    }

    @GetMapping("/test-connection")
    public List<OscePdf> testConnection() {
        return repository.findAll();
    }
}

package com.runevent.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//code where sql request and call  Repository functions
@RestController
public class Runcontroller {

    private final RunRepository runRepository; // call to the repository

    public Runcontroller(RunRepository runRepository){
        this.runRepository= runRepository;
    }

    @GetMapping("/api/runs") //url
    List<Run> findAll(){
        return runRepository.findAll();
    }
    @GetMapping("/api/runs") //url
    List<Run> findById(){
        return runRepository.findAll();
    }
}

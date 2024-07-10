package com.runevent.runnerz.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//code where sql request and call  Repository functions
@RestController
public class Runcontroller {

    private final RunRepository runRepository;

    public Runcontroller(RunRepository runRepository){
        this.runRepository= runRepository;
    }

    @GetMapping("/api/runs")
    List<Run> findAll(){
        return runRepository.findAll();
    }
}

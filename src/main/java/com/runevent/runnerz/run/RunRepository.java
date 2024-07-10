package com.runevent.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

//function code
@Repository
public class RunRepository {



    private List<Run> runs=new ArrayList<>();


    List<Run> findAll(){
        return runs;
    }


@PostConstruct
private void init(){
        runs.add(new Run(1,"lolo", LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),5, Location.OUTDOOR));
    runs.add(new Run(22,"yyyyy", LocalDateTime.now(),LocalDateTime.now().plus(55, ChronoUnit.HOURS),2, Location.OUTDOOR));
}



}

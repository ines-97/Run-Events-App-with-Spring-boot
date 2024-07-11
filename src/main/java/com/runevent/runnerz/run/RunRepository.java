package com.runevent.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//function code
@Repository
public class RunRepository {



    private List<Run> runs=new ArrayList<>();


    public List<Run> findAll(){
        return runs;
    }

/*normal findById function but it did not handle exceptions where the id is not found
    public Run findById(Integer id){
        return runs.stream()
                .filter(run -> run.id()==id)
                .findFirst()
                .get();
    }
    */

    //to catch the error whene the id is not found

    Optional <Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id() == id)
                .findFirst();
    }




    //add
    public void create (Run run){
        runs.add(run);
    }

    //modify
    public void update (Run run , Integer id){
        Optional <Run> o= findById(id);
        if(o.isPresent()){
            runs.set(runs.indexOf(o.get()),run);
        }
    }

    //delete
    public void delete(Integer id){
        runs.removeIf(d->d.id().equals(id));
    }

@PostConstruct
private void init(){
        runs.add(new Run(1,"lolo", LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),5, Location.OUTDOOR));
    runs.add(new Run(2,"yyyyy", LocalDateTime.now(),LocalDateTime.now().plus(2, ChronoUnit.HOURS),2, Location.INDOOR));
    runs.add(new Run(3,"ssss", LocalDateTime.now(),LocalDateTime.now().plus(8, ChronoUnit.HOURS),8, Location.OUTDOOR));
runs.add(new Run(4,"kkk", LocalDateTime.now(),LocalDateTime.now().plus(3, ChronoUnit.HOURS),33, Location.INDOOR));

}



}

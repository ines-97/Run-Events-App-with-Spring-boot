package com.runevent.runnerz.run;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

//record is equals to class but with less code
public record Run(
         Integer id,
         @NotEmpty//for the title to be not empty comes from pom.xml validation dependency
         String title,
         LocalDateTime startedOn,
         LocalDateTime completedOn,
         @Positive //a validation : miles must be positive
         Integer miles,
         Location location
) {

    public Run{ //constrator with no variables
        if(!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("complet must be after start");
        }
    }
}

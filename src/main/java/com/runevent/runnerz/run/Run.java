package com.runevent.runnerz.run;


import java.time.LocalDateTime;

//record is equals to class but with less code
public record Run(
         Integer id,
         String title,
         LocalDateTime startedOn,
         LocalDateTime completedOn,
         Integer miles,
         Location location
) { }

package com.runevent.runnerz;

import com.runevent.runnerz.run.Location;
import com.runevent.runnerz.run.Run;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class RunnerzApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);


	}





/*@Bean
	CommandLineRunner runner(){
		return args -> {
			Run run  =new Run(1,"lolo", LocalDateTime.now(),LocalDateTime.now().plus(1, ChronoUnit.HOURS),5, Location.OUTDOOR);
			log.info("Run:  "+run);
			//log.info
		};
}*/

}

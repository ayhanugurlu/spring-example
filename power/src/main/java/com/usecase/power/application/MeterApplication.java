package com.usecase.power.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.usecase.power.model.MeterReading;
import com.usecase.power.model.Profile;
import com.usecase.power.repository.DbRepository;

@SpringBootApplication
@EnableJpaRepositories("com.usecase.power.repository")
@EntityScan("com.usecase.power.model")
@ComponentScan("com.usecase.power")
public class MeterApplication {

	public static void main(String[] args) {
		 SpringApplication.run(MeterApplication.class, args);

	}
	
	@Bean
    public CommandLineRunner initializeDb(DbRepository repository){
        return (args) -> {
            repository.deleteAll();
            
            List<MeterReading> meterReadings = new ArrayList<>();
            for(int i = 0; i < 10; i++) {
            	Profile p = new Profile();
            	p.setId(new Long(i));
            	p.setMonth(i);
            	p.setYear(2000+i);
            	p.setProfileName(""+i);
            	meterReadings.add(new MeterReading(new Long(i), new Long(i), p, i));
               //repository.save(new MeterReading(i+1L,1L,"a",2016,3,2));
            	System.out.println("aaa"+i);
            }
            
            repository.createMeterReadings(meterReadings);
            
            
        };
    }

}

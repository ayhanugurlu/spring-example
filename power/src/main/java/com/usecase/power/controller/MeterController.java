package com.usecase.power.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.usecase.power.model.Fraction;
import com.usecase.power.model.MeterReading;
import com.usecase.power.service.MeterService;


@RestController
@RequestMapping("/meter")
public class MeterController {

	@Autowired
	private MeterService meterService;

	@RequestMapping(method = RequestMethod.GET,path="/test")
	public String test() {
		return "/meter/test";
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/getAllReadings")
	public ResponseEntity<Collection<MeterReading>> getAllReadings() {
		return new ResponseEntity<Collection<MeterReading>>((Collection<MeterReading>) meterService.getAllMeterReading(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/getAllFraction")
	public ResponseEntity<Collection<Fraction>> getAllFraction() {
		return new ResponseEntity<Collection<Fraction>>((Collection<Fraction>) meterService.getAllFranction(), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST,path="/importFraction")
	public void importFraction(RequestEntity<Collection<Fraction>> fractionsRequestEntity) {		
		meterService.createFractions(fractionsRequestEntity.getBody());
	}
	
	@RequestMapping(method = RequestMethod.POST,path="/importMeterReading")
	public void importMeterReading(RequestEntity<Collection<MeterReading>> meterRequestEntity) {		
		meterService.createMeterReadings(meterRequestEntity.getBody());
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST,path="/getConsumption")
	public void getConsumption(int month, int year, long connectionId) {		
		meterService.getConsumption(month, year, connectionId);
	}
	
}

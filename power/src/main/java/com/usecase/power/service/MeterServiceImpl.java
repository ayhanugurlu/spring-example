package com.usecase.power.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecase.power.model.Fraction;
import com.usecase.power.model.MeterReading;
import com.usecase.power.repository.DbRepository;


@Service
public class MeterServiceImpl implements MeterService {

	@Autowired
	DbRepository repository;

	@Override
	public Iterable<Fraction> getAllFranction() {
		return repository.getAllFranction();
	}

	@Override
	public Iterable<MeterReading> getAllMeterReading() {
		return repository.getAllMeterReading();
	}

	@Override
	public MeterReading findByMonth() {
		return repository.findByMonth();
	}

	@Override
	public void createFractions(Collection<Fraction> fractions) {
		repository.createFractions(fractions);

	}

	@Override
	public void createMeterReadings(Collection<MeterReading> meterReadings) {
		repository.createMeterReadings(meterReadings);

	}

	@Override
	public void getConsumption(int month, int year, long connectionId) {
		// TODO Auto-generated method stub

	}

}

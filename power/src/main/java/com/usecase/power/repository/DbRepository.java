package com.usecase.power.repository;

import java.util.Collection;

import com.usecase.power.model.Fraction;
import com.usecase.power.model.MeterReading;

public interface DbRepository {
	Iterable<Fraction> getAllFranction();

	Iterable<MeterReading> getAllMeterReading();

	MeterReading findByMonth(Long id);
	
	void createFractions(Collection<Fraction> fractions);
	
	void createMeterReadings(Collection<MeterReading> meterReadings);

	void deleteAll();
}

package com.usecase.power.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.usecase.power.model.Fraction;
import com.usecase.power.model.MeterReading;

@org.springframework.stereotype.Repository
public class RelationalDbRepositoryImpl implements DbRepository {

	@Autowired
	FractionRepository fractionRepository;

	@Autowired
	MeterReadingRepository meterReadingRepository;

	@Override
	public Iterable<Fraction> getAllFranction() {
		return fractionRepository.findAll();
	}

	@Override
	public Iterable<MeterReading> getAllMeterReading() {
		return meterReadingRepository.findAll();
	}

	@Override
	public MeterReading findByMonth(Long id) {
		return meterReadingRepository.findOne(id);
	}

	@Override
	public void createFractions(Collection<Fraction> fractions) {
		fractionRepository.save(fractions);
	}

	@Override
	public void createMeterReadings(Collection<MeterReading> meterReadings) {
		meterReadingRepository.save(meterReadings);

	}

	@Override
	public void deleteAll() {
		meterReadingRepository.deleteAll();
		fractionRepository.deleteAll();		
	}

}

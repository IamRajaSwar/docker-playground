package com.csd.spring.cars.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csd.spring.cars.exceptions.CarNotFoundException;
import com.csd.spring.cars.models.Car;
import com.csd.spring.cars.repositories.CarRepository;
@Service
public class CarService implements ICarService{
	@Autowired
	private CarRepository repository;
	@Override
	public Car save(Car car) {
		car.setPurchaseDate(new Date());
		return repository.save(car);
	}

	@Override
	public Car update(Car car) throws CarNotFoundException {
		repository.findById(car.getCarNo()).orElseThrow(()-> new CarNotFoundException("Car not found") );
		return repository.save(car);
	}

	@Override
	public Car getCar(int id) throws CarNotFoundException {
		return repository.findById(id).orElseThrow(()-> new CarNotFoundException("Car not found") );
	}

}

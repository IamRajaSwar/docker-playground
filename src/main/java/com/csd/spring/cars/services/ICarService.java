package com.csd.spring.cars.services;

import com.csd.spring.cars.exceptions.CarNotFoundException;
import com.csd.spring.cars.models.Car;

public interface ICarService {
	public Car save(Car car);
	public Car update(Car car) throws CarNotFoundException;
	public Car getCar(int id) throws CarNotFoundException;
}

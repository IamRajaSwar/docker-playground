package com.csd.spring.cars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csd.spring.cars.exceptions.CarNotFoundException;
import com.csd.spring.cars.models.Car;
import com.csd.spring.cars.services.ICarService;

@RestController
@RequestMapping("/car-service")
public class CarController {
	@Autowired
	private ICarService carService;
	
	@PostMapping("/save")
	public ResponseEntity<Car> makeCar(@RequestBody Car car){
		
		return new ResponseEntity<Car>(carService.save(car),HttpStatus.CREATED);
		
	}
	@PutMapping("/save")
	public ResponseEntity<Car> updateCar(@RequestBody Car car){
		
		return new ResponseEntity<Car>(carService.save(car),HttpStatus.CREATED);
		
	}
	@GetMapping("car/{id}")
	public ResponseEntity<Car> getCar(@PathVariable("id") int carId) throws CarNotFoundException{
		return new ResponseEntity<Car>(carService.getCar(carId),HttpStatus.OK);
	}

}

package com.csd.spring.cars.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csd.spring.cars.models.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}

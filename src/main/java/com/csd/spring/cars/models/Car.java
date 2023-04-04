package com.csd.spring.cars.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Car {
	@Id
	@SequenceGenerator(name = "carSeq", initialValue = 1000,allocationSize = 1,sequenceName = "CAR_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "carSeq")
	private int carNo;
	private String name;
	private Date purchaseDate;
	private double price;
	private int ownerKey;
}

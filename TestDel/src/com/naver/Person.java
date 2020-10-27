package com.naver;

import java.time.LocalDateTime;

import com.ezen.Dog;

public class Person {
	private String name;
	private String address;
	private LocalDateTime time;
	private Dog dog;
	private Car car;
	private Wapon wapon;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	

	public Person(String name, String address, LocalDateTime time, Dog dog, Car car) {
		super();
		this.name = name;
		this.address = address;
		this.time = time;
		this.dog = dog;
		this.car = car;
	}



	public Dog getDog() {
		return dog;
	}



	public void setDog(Dog dog) {
		this.dog = dog;
	}



	public Car getCar() {
		return car;
	}



	public void setCar(Car car) {
		this.car = car;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
}

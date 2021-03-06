package com.rtb.groovy

class Patient {
	
	def firstName, lastName, age
	static hospitalCode = "Best Hospital"
	
	// groovy will generate all the geters and setters and will
	// also generate one named constructor
	
	// we can override the getters and setters
	void setLastName(lastName) {
		
		if(lastName == null) {
			
			throw new IllegalArgumentException("Last name cannot be null")
		}
		
		this.lastName = lastName
	}
	
	static void display() {
		
		println hospitalCode
	}
	
}

p = new Patient(firstName : "John", lastName : "Bailey", age : 40)

p.setLastName("Buffer")
println p.firstName + " " + p.lastName + " " + p.age

Patient.display()


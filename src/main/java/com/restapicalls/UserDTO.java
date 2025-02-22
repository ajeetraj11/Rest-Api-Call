package com.restapicalls;

// This class acts as a Data Transfer Object (DTO) for POST requests
public class UserDTO {
	// Attribute for storing the first name
	private String firstName;

	// Attribute for storing the last name
	private String lastName;

	// Default constructor
	public UserDTO() {
	}

	// Constructor with parameters to initialize both names
	public UserDTO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getter method for first name
	public String getFirstName() {
		return firstName;
	}

	// Setter method for first name
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// Getter method for last name
	public String getLastName() {
		return lastName;
	}

	// Setter method for last name
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
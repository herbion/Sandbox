package com.epam.nulp.tasks;

import com.epam.nulp.tasks.exceptions.*;


public class Student implements Comparable<Student> {

    private String firstName;
    private String middleName;
    private String lastName;
    private byte age;
    
    @SuppressWarnings("unused")
    private Student() {

    }

    public Student(String firstName, String middleName, String lastName,
	    byte age) {
	super();
	if (firstName == null || middleName == null || lastName == null)
	    throw new IllegalArgumentException("Null pointers");
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(byte age) throws AgeFormatException {
	if (age <= 0) 
	    throw new AgeFormatException("Age of student cannot be less or equal zero.");
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.lastName.compareToIgnoreCase(o.getLastName());
    }

    public byte getAge() {
	return age;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public String getMiddleName() {
	return middleName;
    }

    @Override
    public String toString() {
	return "Student [firstName=" + firstName + ", middleName=" + middleName
		+ ", lastName=" + lastName + ", age=" + age + "]";
    }

}


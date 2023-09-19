package fr.mns.jee.tp1Annuaire.model;

import java.io.Serializable;
import java.sql.Date;

import fr.mns.jee.tp1Annuaire.enums.Gender;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String lastname;
	private String firstName;
	private Date birthDate;
	private long id;
	private String phoneNumber;
	private Gender gender;

	public Person() {
		super();
	}

	public Person(String lastname, String firstName, Date birthDate, long id, String phoneNumber, Gender gender) {
		super();
		this.lastname = lastname;
		this.firstName = firstName;
		this.birthDate = birthDate;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
}

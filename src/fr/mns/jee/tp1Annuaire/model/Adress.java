package fr.mns.jee.tp1Annuaire.model;

public class Adress {
	private int number;
	private String street;

	public Adress() {
		super();
	}

	public Adress(int number, String street) {
		super();
		this.number = number;
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}

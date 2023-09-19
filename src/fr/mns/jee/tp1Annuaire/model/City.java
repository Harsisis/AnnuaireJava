package fr.mns.jee.tp1Annuaire.model;

public class City {
	private int postCode;
	private String name;
	private String country;

	public City(int postCode, String name, String country) {
		super();
		this.postCode = postCode;
		this.name = name;
		this.country = country;
	}

	public City() {
		super();
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

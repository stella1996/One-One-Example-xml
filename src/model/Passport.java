package model;

public class Passport {

	private int personId;
	private String passportNumber;
	private int passportId;
	private Person person;
	
	

	public int getPassportId() {
		return passportId;
	}


	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}


	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personid) {
		this.personId = personid;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}

	
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", personid=" + personId
				+ "]";
	}
	
	
	
	
}

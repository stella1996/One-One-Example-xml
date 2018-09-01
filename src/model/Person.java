package model;

public class Person {
	
	private int personId;
	private String personName;
	private String email;
	private Passport passport;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", email=" + email + "]";
	}
	

}

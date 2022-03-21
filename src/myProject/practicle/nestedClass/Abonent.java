package myProject.practicle.nestedClass;

import java.util.Random;

public class Abonent {

	PhoneNumber n1 = new PhoneNumber();
	private String name;
	private int id;
	private String number;

	class PhoneNumber {
		private int countryCode;
		private int netCode;
//		private String a;

		public int generateNumber() {
			return new Random().nextInt(10_000_000);
		}

		public int getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(int countryCode) {
			this.countryCode = countryCode;
		}

		public int getNetCode() {
			return netCode;
		}

		public void setNetCode(int netCode) {
			this.netCode = netCode;
		}

		public String pNumber() {
			return ("+" + countryCode + " " + netCode + " " + generateNumber());
		}

	}

	public void sCode(int cCode, int nCode) {
		
		n1.setCountryCode(cCode);
		n1.setNetCode(nCode);
		
	}
	
	public Abonent(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void setNumber() {
		this.number = n1.pNumber();

	}
	

	public void printAbonent() {
		setNumber();
		System.out.println("Yoar accaunt: ");
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Number: " + number);

	}

	@Override
	public String toString() {
		return "Abonent [n1=" + n1 + ", name=" + name + ", id=" + id
				+ ", number=" + number + "]";
	}
	
	 

}

package mru.tsc.model;

public class Toy {
	protected String sn;
	protected String name;
	protected String brand;
	protected String price;
	protected String availableCount;
	protected String ageAppropriate;
	
	public Toy(String sn, String name, String brand, String price, 
			String availableCount, String ageAppropriate) {
		this.sn = sn;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availableCount = availableCount;
		this.ageAppropriate = ageAppropriate;
	}
	
	public String getSN() {
		return this.sn;
	}
	
	public String getSn() {
		return sn;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getPrice() {
		return price;
	}

	public String getAvailableCount() {
		return availableCount;
	}

	public String getAgeAppropriate() {
		return ageAppropriate;
	}
	
}

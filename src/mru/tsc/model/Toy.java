package mru.tsc.model;

/**
 * The Toy class is an abstract class that holds the general parameters that a toy needs to have.
 * Classes that represent a specific toy type will inherit from this class.
 * @author Kevin Luo and Shaina Anne Garrido
 */
public abstract class Toy {

	// The Serial Number
	private Long sn;

	// The name of the toy
	private String name;

	// The brand of the toy
	private String brand;

	// The price of the toy
	private double price;

	// The amount of toys left in storage
	private int availableCount;

	// The appropriate age for the toy
	private int ageAppropriate;

	/**
	 * Standard constructor
	 * 
	 * @param sn             Serial Number
	 * @param name           Name of the toy
	 * @param brand          Brand of the toy
	 * @param price          Price of the toy
	 * @param availableCount The amount of toys left in storage
	 * @param ageAppropriate The appropriate age of the toy
	 */
	public Toy(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate) {
		this.sn = sn;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.availableCount = availableCount;
		this.ageAppropriate = ageAppropriate;
	}

	/**
	 * Accessor method to Serial Number
	 * 
	 * @return The Serial Number
	 */
	public Long getSn() {
		return sn;
	}

	/**
	 * Mutator method to change the Serial Number
	 * 
	 * @param sn the serial number
	 */
	public void setSn(Long sn) {
		this.sn = sn;
	}

	/**
	 * Accessor method to name
	 * 
	 * @return The name of the toy
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mutator method to change the name of the toy
	 * 
	 * @param name The name of the toy
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Accessor method to brand
	 * 
	 * @return The brand of the toy
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Mutator method to change the brand of the toy
	 * 
	 * @param brand The brand of the toy
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Accessor method to price
	 * 
	 * @return The price of the toy
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Mutator to change the price
	 *
	 * @param price Price of the toy
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Accessor method to the amount of toys available
	 * 
	 * @return Amount of toys available
	 */
	public int getAvailableCount() {
		return availableCount;
	}

	/**
	 * Mutator to change the amount of toys available
	 *
	 * @param availableCount The amount of toys available
	 */
	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	/**
	 * Accessor method to appropriate age
	 * 
	 * @return The appropriate age of the toy
	 */
	public int getAgeAppropriate() {
		return ageAppropriate;
	}

	/**
	 * Mutator to appropriate age of the toy
	 *
	 * @param ageAppropriate The appropriate age of the toy
	 */
	public void setAgeAppropriate(int ageAppropriate) {
		this.ageAppropriate = ageAppropriate;
	}

	/**
	 * The abstract method of the Toy class
	 */
	public abstract String Format();

	public abstract String Write();
}

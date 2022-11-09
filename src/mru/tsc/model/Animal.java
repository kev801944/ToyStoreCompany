package mru.tsc.model;

/**
 * The Animal class is a class that holds information about a animal toy.
 * This class inherits from the parent class Toy
 */
public class Animal extends Toy {

	// The material of the Animal
	private String material;

	// The size of the Animal
	private String size;

	/**
	 * Standard constructor
	 * 
	 * @param sn             Serial Number
	 * @param name           Name of the toy
	 * @param brand          Brand of the toy
	 * @param price          Price of the toy
	 * @param availableCount Amount of toys available
	 * @param ageAppropriate Appropriate age of the toy
	 * @param material       Material of the toy
	 * @param size           Size of the toy
	 */
	public Animal(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, String material,
			String size) {

		// Calling the super constructor to create an instance of the superclass
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.material = material;
		this.size = size;
	}

	/**
	 * 
	 * @return
	 */
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String Format() {
		// TODO Auto-generated method stub
		return ("Category: Animal, " + "Serial Number: " + this.getSn() + ", " + "Name: " + this.getName() + ", " +
				"Brand: " + this.getBrand() + ", " + "Price: " + this.getPrice() + ", " +
				"Available Count: " + this.getAvailableCount() + ", " + "Age Appropriate: "
				+ this.getAgeAppropriate() + "+, " +
				"Material: " + this.material + ", " + "Size: " + this.size);
	}

	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.material + ";" + this.size + "\n");
	}
}

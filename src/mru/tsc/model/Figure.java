package mru.tsc.model;

/**
 * This is a subclass from the superclass Toy
 * This class talks about the contents included in a toy figure
 * @author Kevin Luo and Shaina Anne Garrido
 *
 */
public class Figure extends Toy {
	//what kind of toy it is
	private String classification;

	/**
	 * constructor that includes the elements of the toy figure
	 * @param sn the serial number 
	 * @param name the name of the toy figure
	 * @param brand the brand of the toy figure
	 * @param price the price of the toy figure
	 * @param availableCount the number of figures available
	 * @param ageAppropriate the age a person must be to play with the toy
	 * @param classification what kind of toy it is
	 */
	public Figure(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, String classification) {
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.classification = classification;
	}

	/**
	 * the accessor method for classifying what kind of toy figure it is
	 * @return the classification of toy figure
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * the mutator method for classifying what kind of toy figure it is
	 * @param classification classifying what kind of toy figure it is
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}

	/**
	 * This overrides Format in the superclass
	 */
	@Override
	public String Format() {
		// TODO Auto-generated method stub
		return ("Category: Figure, " + "Serial Number: " + this.getSn() + ", " + "Name: " + this.getName() + ", " +
				"Brand: " + this.getBrand() + ", " + "Price: " + this.getPrice() + ", " +
				"Available Count: " + this.getAvailableCount() + ", " + "Age Appropriate: "
				+ this.getAgeAppropriate() + "+, " +
				"Classification: " + this.classification);
	}

	/**
	 * This overrides Write in the superclass
	 */
	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.classification + "\n");
	}
}

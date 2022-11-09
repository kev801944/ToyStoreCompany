package mru.tsc.model;

public class Figure extends Toy {
	private String classification;

	public Figure(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, String classification) {
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.classification = classification;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	@Override
	public String Format() {
		// TODO Auto-generated method stub
		return ("Category: Figure, " + "Serial Number: " + this.getSn() + ", " + "Name: " + this.getName() + ", " +
				"Brand: " + this.getBrand() + ", " + "Price: " + this.getPrice() + ", " +
				"Available Count: " + this.getAvailableCount() + ", " + "Age Appropriate: "
				+ this.getAgeAppropriate() + "+, " +
				"Classification: " + this.classification);
	}

	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.classification + "\n");
	}
}

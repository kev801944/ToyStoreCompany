package mru.tsc.model;

public class Figure extends Toy{
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
}

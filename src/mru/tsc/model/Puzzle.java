package mru.tsc.model;

public class Puzzle extends Toy {
	private String puzzleType;

	public Puzzle(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, String puzzleType) {
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.puzzleType = puzzleType;
	}

	public String getPuzzleType() {
		return puzzleType;
	}

	public void setPuzzleType(String puzzleType) {
		this.puzzleType = puzzleType;
	}

	@Override
	public String Format() {
		// TODO Auto-generated method stub
		return ("Category: Puzzle, " + "Serial Number: " + this.getSn() + ", " + "Name: " + this.getName() + ", " +
				"Brand: " + this.getBrand() + ", " + "Price: " + this.getPrice() + ", " +
				"Available Count: " + this.getAvailableCount() + ", " + "Age Appropriate: "
				+ this.getAgeAppropriate() + "+, " +
				"Puzzle Type: " + this.puzzleType);
	}

	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.puzzleType + "\n");
	}
}
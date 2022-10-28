package mru.tsc.model;

public class Puzzle extends Toy{
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
	public void Format() {
		// TODO Auto-generated method stub
		System.out.println("Category: Puzzle, "+"Serial Number: "+this.getSn()+", "+"Name: "+this.getName()+", "+
		"Brand: "+this.getBrand()+", "+"Price: "+this.getPrice()+", "+
		"Available Count: "+this.getAvailableCount()+", "+"Age Appropriate: "+this.getAgeAppropriate()+"+, "+
		"Puzzle Type: "+this.puzzleType);
	}
}
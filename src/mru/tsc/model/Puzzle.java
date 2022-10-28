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
	public String Format(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
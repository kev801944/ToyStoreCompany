package mru.tsc.model;

/**
 * This is a subclass from the superclass Toy
 * This class is about puzzles and included that elements are needed for a puzzle game
 * @author Shaina Anne Garrido and Kevin Luo
 *
 */
public class Puzzle extends Toy {
	//this is what kind of puzzle game it is
	private String puzzleType;

	/**
	 * This is a constructor that includes the elements in a puzzle game
	 * @param sn 				the serial number
	 * @param name				the name of the puzzle game
	 * @param brand 			the brand of the puzzle game
	 * @param price 			the price of the puzzle game
	 * @param availableCount	the number of puzzle games available
	 * @param ageAppropriate 	the age a person must be to play the game
	 * @param puzzleType 		what kind of puzzle it is
	 */
	public Puzzle(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, String puzzleType) {
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.puzzleType = puzzleType;
	}

	/**
	 * the accessor method for what kind of puzzle it is
	 * @return the type of puzzle
	 */
	public String getPuzzleType() {
		return puzzleType;
	}

	/**
	 * the mutator method for what kind of puzzle it is
	 * @param puzzleType the type of puzzle
	 */
	public void setPuzzleType(String puzzleType) {
		this.puzzleType = puzzleType;
	}

	/**
	 * this overrides Format from the superclass
	 */
	@Override
	public String Format() {
		// TODO Auto-generated method stub
		return ("Category: Puzzle, " + "Serial Number: " + this.getSn() + ", " + "Name: " + this.getName() + ", " +
				"Brand: " + this.getBrand() + ", " + "Price: " + this.getPrice() + ", " +
				"Available Count: " + this.getAvailableCount() + ", " + "Age Appropriate: "
				+ this.getAgeAppropriate() + "+, " +
				"Puzzle Type: " + this.puzzleType);
	}

	/**
	 * thsi overrides the Write from the superclass
	 */
	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.puzzleType + "\n");
	}
}
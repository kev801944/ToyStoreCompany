package mru.tsc.model;

/**
 * This class is the subclass from the parents class Toy
 * this class talks about the contents of what the Board game class includes that is not included in the toy class
 * @author Shaina Anne Garrido and Kevin Luo
 *
 */
public class BoardGame extends Toy {
	//the minumum number of players needed to play the board game
	private int minPlayer;
	
	//the maximum number of players that can play the board game 
	private int maxPlayer;
	
	// the designer of the board game
	private String designer;

	/**
	 * this is a copy constructor that includes the parameters needed for a board game
	 * sn, name, brand, price, availableCount, and ageAppropriate are called from the superclass
	 * @param sn 				serial number
	 * @param name 				name of the board game
	 * @param brand 			brand of the board game
	 * @param price 			price of the board game
	 * @param availableCount 	how many board games they have
	 * @param ageAppropriate 	the minimum age limit of the game
	 * @param minPlayer 		the minimum number of players needed to play
	 * @param maxPlayer 		the maximum number of players that can play
	 * @param designer 			the designer of the game
	 */
	public BoardGame(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, int minPlayer,
			int maxPlayer, String designer) {
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.designer = designer;
		this.minPlayer = minPlayer;
		this.maxPlayer = maxPlayer;
	}

	/**
	 * the getter method for minimum number of players
	 * @return the minimum number of players
	 */
	public int getMinPlayer() {
		return minPlayer;
	}

	/**
	 * the setter method for the minimum number of players
	 * @param minPlayer the minimum number of players needed to play the game
	 */
	public void setMinPlayer(int minPlayer) {
		this.minPlayer = minPlayer;
	}

	/**
	 * the getter method for the maximum number of players
	 * @return the maximum numbers of players needed for the bard game
	 */
	public int getMaxPlayer() {
		return maxPlayer;
	}

	/**
	 * the setter method for the maximum number of players
	 * @param maxPlayer the maximum number of players needed to play the board game
	 */
	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}

	/**
	 * the getter method for the designer
	 * @return the designer
	 */
	public String getDesigner() {
		return designer;
	}

	/**
	 * the setter method for the designer of the board game
	 * @param designer of the board game
	 */
	public void setDesigner(String designer) {
		this.designer = designer;
	}

	/**
	 * ther getter method that has the minimum and maximum number of players needed for the board game
	 * @param minPlayer the minimum number of players needed for the board game
	 * @param maxPlayer the maximum number of players needed for the board game
	 * @return the minPlayer and maxPlayer of the board game
	 */
	public String getNumOfPlayer(int minPlayer, int maxPlayer) {
		return minPlayer + " " + maxPlayer;
	}

	/**
	 * This overrides Format from the superclass
	 */
	@Override
	public String Format() {
		// TODO Auto-generated method stub
		return ("Category: Board Game, " + "Serial Number: " + this.getSn() + ", " + "Name: "
				+ this.getName() + ", " +
				"Brand: " + this.getBrand() + ", " + "Price: " + this.getPrice() + ", " +
				"Available Count: " + this.getAvailableCount() + ", " + "Age Appropriate: " + this.getAgeAppropriate()
				+ "+, " +
				"Number Of Players: " + this.minPlayer + "-" + this.maxPlayer + ", " + "Designer: " + this.designer);
	}

	/**
	 * This overrides Write from the superclass
	 */
	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.minPlayer + "-" + this.maxPlayer + ";" + this.designer + "\n");
	}
}

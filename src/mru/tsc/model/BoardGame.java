package mru.tsc.model;

public class BoardGame extends Toy {
	private int minPlayer;
	private int maxPlayer;
	private String designer;

	public BoardGame(Long sn, String name, String brand, double price,
			int availableCount, int ageAppropriate, int minPlayer,
			int maxPlayer, String designer) {
		super(sn, name, brand, price,
				availableCount, ageAppropriate);
		this.designer = designer;
		this.minPlayer = minPlayer;
		this.maxPlayer = maxPlayer;
	}

	public int getMinPlayer() {
		return minPlayer;
	}

	public void setMinPlayer(int minPlayer) {
		this.minPlayer = minPlayer;
	}

	public int getMaxPlayer() {
		return maxPlayer;
	}

	public void setMaxPlayer(int maxPlayer) {
		this.maxPlayer = maxPlayer;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getNumOfPlayer(int minPlayer, int maxPlayer) {
		return minPlayer + " " + maxPlayer;
	}

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

	@Override
	public String Write() {
		return (this.getSn() + ";" + this.getName() + ";" + this.getBrand() + ";" + this.getPrice() + ";"
				+ this.getAvailableCount() + ";"
				+ this.getAgeAppropriate() + ";" + this.minPlayer + "-" + this.maxPlayer + ";" + this.designer + "\n");
	}
}

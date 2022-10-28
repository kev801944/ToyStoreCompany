package mru.tsc.model;

public class BoardGame extends Toy{
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
}

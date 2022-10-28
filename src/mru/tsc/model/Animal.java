package mru.tsc.model;

public class Animal extends Toy{
	private String material;
	private String size;
	
	public Animal(Long sn, String name, String brand, double price, 
			int availableCount, int ageAppropriate, String material,
			String size) {
		super(sn, name, brand, price, 
				availableCount, ageAppropriate);
		this.material = material;
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void Format() {
		// TODO Auto-generated method stub
		System.out.println("Category: Animal, "+"Serial Number: "+this.getSn()+", "+"Name: "+this.getName()+", "+
		"Brand: "+this.getBrand()+", "+"Price: "+this.getPrice()+", "+
		"Available Count: "+this.getAvailableCount()+", "+"Age Appropriate: "+this.getAgeAppropriate()+"+, "+
		"Material: "+this.material+", "+"Size: "+this.size);
	}
}









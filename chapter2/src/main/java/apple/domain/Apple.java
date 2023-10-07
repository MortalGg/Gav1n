package apple.domain;

public class Apple {
	
	public float price;
	public float weight;
	public String area ;
	
	public Apple(float price, float weight, String area) {
		super();
		this.price = price;
		this.weight = weight;
		this.area = area;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getarea() {
		return area;
	}
	public void setTaste(String areaString) {
		this.area = area;
	}
	
}

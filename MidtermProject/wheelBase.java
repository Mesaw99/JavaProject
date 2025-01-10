public class wheelBase{
	public double force;
	public String model;
	public double price;
	public String brand;
	
	public wheelBase(double f, String m, double p, String b) {
		this.force = f;
		this.model = m;
		this.price = p;
		this.brand = b;
	}
	
	wheelBase 1 = new wheelBase(5.5, "r5", 430.00, "moza");
	wheelBase 2 = new wheelBase(25, "2 pro", 430.00, "simucube");

	public void setForce(double f) {
		this.force = f;
	}
	public double getForce() {
		return force;
	}
	public void setModel(String m) {
		this.model = m;
	}
	public double getModel() {
		return model;
	}
	public void setPrice(double p) {
		this.price = p;
	}
	public double getPrice() {
		return price;
	}
	public void setBrand(String b) {
		this.brand = b;
	}
	public double getBrand() {
		return brand;
	}
}

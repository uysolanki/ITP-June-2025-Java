package day10;

public class Car {
	String carModelName;
	String carMfgName;
	double carPrice;
	String carColor;
	
	Engine engine;
	Gear gear;
	
	public Car() {}
	public Car(String carModelName, String carMfgName, double carPrice, String carColor, Engine engine, Gear gear) {
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.carPrice = carPrice;
		this.carColor = carColor;
		this.engine = engine;
		this.gear = gear;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCarMfgName() {
		return carMfgName;
	}
	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	@Override
	public String toString() {
		return "Car [carModelName=" + carModelName + ", carMfgName=" + carMfgName + ", carPrice=" + carPrice
				+ ", carColor=" + carColor + ", engine=" + engine + ", gear=" + gear + "]";
	}
	
	

}

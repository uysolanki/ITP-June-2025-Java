package day10;

public class DriverApp {

	public static void main(String[] args) {
		Engine e1=new Engine(1.5,1500,"Honda","Petrol");
		Engine e2=new Engine(2.5,2500,"Toyota","Diesel");
		
		
		Gear g1=new Gear(6,"Tata","Automatic");
		Gear g2=new Gear(8,"Mahindra","Manual");
		
		Car c1=new Car("Q3","Audi",100.0,"Black",e1,g1);
		Car c2=new Car("City","Honda",50.0,"White",e2,g2);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}

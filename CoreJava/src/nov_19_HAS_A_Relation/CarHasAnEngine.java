package nov_19_HAS_A_Relation;

import java.util.Scanner;
public class CarHasAnEngine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String model = sc.nextLine();
		int engineCapacity = sc.nextInt();
		sc.nextLine();
		String make = sc.nextLine();
		String carmodel = sc.nextLine();
		int year = sc.nextInt();
		Car c = new Car(model, engineCapacity, make, carmodel, year);
		System.out.println(c);
	}
}

class Engine {
	private String model;
	private int engineCapacity;

	Engine(String model, int engineCapacity) {
		if (engineCapacity <= 0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.model = model;
		this.engineCapacity = engineCapacity;
	}

	public String getModel() {
		return this.model;
	}

	public int getEngineCapacity() {
		return this.engineCapacity;
	}

	public String toString() {
		return "Engine Details -> Engine Model: " + this.model + ", Engine Capacity: " + this.engineCapacity;
	}
}

class Car {
	private String make;
	private String carmodel;
	private int year;
	private Engine engine;

	public Car(String model, int engineCapacity, String make, String carmodel, int year) {
		if (year <= 0) {
			System.out.println("Error Invalid Input");
			System.exit(0);
		}
		this.make = make;
		this.carmodel = carmodel;
		this.year = year;
		this.engine = new Engine(model, engineCapacity);
	}

	public String toString() {
		return "Car Make: " + this.make + ", Car Model: " + carmodel + ", Year: " + this.year + "\n" + engine + "cc";
	}

}

package oct_24;
import java.util.Scanner;
public class VehicleEfficiencyCalculator {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Model: ");
		String model=sc.nextLine();
		System.out.print("Enter Mileage: ");
		double mileage=Double.parseDouble(sc.nextLine());
		Vehicle v1=new Vehicle(model, mileage);
		System.out.println();
		System.out.println("--------Vehicle Efficiency Details----------");
		System.out.println(CalculateVehicleEfficiency.calculateEfficiency(v1));
	}
}

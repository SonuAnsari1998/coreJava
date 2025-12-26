package dec_26_2025_Custom_Exception;

public class CarTest {
	public static void stop(String stop) throws CarStoppedException {
		if (stop.equals("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		} else if (stop.equals("go")) {
			IO.print("Car not stalled.");
		} else {
		}
		IO.println("Car not stall");
	}

	public static void puncture(String puncture) throws CarPunctureException {
		if (puncture.equals("puncture")) {
			throw new CarPunctureException("Car is punctured");
		} else if (puncture.equals("move")) {
			IO.println("Car not punctured.");
		} else {
			IO.println("Car not stall.");
		}
	}

	public static void carHeat(int carHeat) throws CarHeatException {
		if (carHeat > 50) {
			throw new CarHeatException("Car is heated more the 50 degrees");
		} else {
			IO.print("Car temperature normal.");
		}
	}
}

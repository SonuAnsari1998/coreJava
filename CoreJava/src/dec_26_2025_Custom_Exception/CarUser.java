package dec_26_2025_Custom_Exception;

public class CarUser {
	void main() {
		try {
			String carStop = IO.readln("Car (stop/go)");
			CarTest.stop(carStop);
			String puncture = IO.readln("Enter car puncture (puncture/move)");
			CarTest.puncture(puncture);
			int carHeat = Integer.parseInt(IO.readln("Enter Car Heat"));
			CarTest.carHeat(carHeat);
		} catch (CarStoppedException | CarPunctureException | CarHeatException e) {
			IO.println(e.getMessage());
		}
	}
}

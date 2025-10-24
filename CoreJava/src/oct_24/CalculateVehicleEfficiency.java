package oct_24;
/*Mileage (km/l)              Efficiency
> 25                        Highly Efficient
>= 18                       Efficient
>= 12                       Moderate
< 12                        Poor */
public class CalculateVehicleEfficiency {
	public static VehicleEfficiency calculateEfficiency(Vehicle v){
		double mlg=v.getMileage();
		VehicleEfficiency veff=null;
		if(mlg>25) {
			veff = new VehicleEfficiency(v,"Highly Efficient");
		}else if(mlg>=18 && mlg<=25) {
			veff = new VehicleEfficiency(v,"Efficient");
		}else if(mlg>=12 && mlg<18) {
			veff = new VehicleEfficiency(v,"Moderate");
		}else{
			veff = new VehicleEfficiency(v,"Poor");
		}
		return veff;
	}
}

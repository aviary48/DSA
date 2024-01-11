package solidPrinciples.openClosedPrinciple;

public class SalonCar extends VehicleCalculations{
    public SalonCar(double valueOfVehicle) {
        super(valueOfVehicle);
    }

    double performCalculations(){
        return this.getValueOfVehicle()*30.0;
    }
}

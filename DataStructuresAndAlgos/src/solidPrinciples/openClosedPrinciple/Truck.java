package solidPrinciples.openClosedPrinciple;

public class Truck extends VehicleCalculations {

    public Truck(double valueOfVehicle) {
        super(valueOfVehicle);
    }

    public double performCalculation(){
        return this.getValueOfVehicle () * 80.0;
    }
}

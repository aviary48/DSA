package solidPrinciples.openClosedPrinciple;

public class VehicleCalculations {

    double valueOfVehicle ;


    public VehicleCalculations(double valueOfVehicle) {
        this.valueOfVehicle = valueOfVehicle;
    }

    public double getValueOfVehicle() {
        return valueOfVehicle;
    }
    public void setValueOfVehicle(double valueOfVehicle) {
        this.valueOfVehicle = valueOfVehicle;
    }

    public double calculateValue(){
            return getValueOfVehicle();
    }
}

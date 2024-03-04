// DieselVehicle.java
public class DieselVehicle extends Vehicle
{
    private final double fuelCost;
    private final int mileage;

    public DieselVehicle(double fuelCost, int mileage)
    {
        this.fuelCost = fuelCost;
        this.mileage = mileage;
    }

    @Override
    public double calculateCostPerMile()
    {
        return fuelCost / mileage;
    }
}

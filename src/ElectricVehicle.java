// ElectricVehicle.java
public class ElectricVehicle extends Vehicle
{
    private final double chargeCost;
    private final int range;

    public ElectricVehicle(double chargeCost, int range)
    {
        this.chargeCost = chargeCost;
        this.range = range;
    }

    @Override
    public double calculateCostPerMile()
    {
        return chargeCost / range;
    }
}

/*
 example
 *
*/

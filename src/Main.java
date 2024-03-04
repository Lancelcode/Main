//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle electricCar = new ElectricVehicle(3.222, 120);
        Vehicle dieselCar = new DieselVehicle(1.507 * 55, 450);

        double electricCostPerMile = electricCar.calculateCostPerMile();
        double dieselCostPerMile = dieselCar.calculateCostPerMile();

        System.out.println("Cost per mile for Electric Vehicle: £" + electricCostPerMile);
        System.out.println("Cost per mile for Diesel Vehicle: £" + dieselCostPerMile);

        if (electricCostPerMile < dieselCostPerMile) {
            System.out.println("Electric Vehicle is more economical.");
        } else if (electricCostPerMile > dieselCostPerMile) {
            System.out.println("Diesel Vehicle is more economical.");
        } else {
            System.out.println("Both vehicles have the same cost per mile.");
        }
    }
}

// inputted temperatures are all in Fahrenheit (F)
public class Main {
    public static void waterTemps(int temperature) {
        if (temperature >= 30) {
            System.out.println("This is the temperature that water turns into a liquid or maintains its state.");
        }
        if (temperature >= 32) {
            System.out.println("Any liquid including water changes to a solid at 32 degrees Fahrenheit.");
        }
        if (temperature >= 212) {
            System.out.println("Heating a volume of water changes its phase into water vapor (the gaseous form of water).");
        }
        else {
            System.out.println("The temperature needs to be greater than 30 degrees Fahrenheit to turn into a new water state.");
        }
    }
}
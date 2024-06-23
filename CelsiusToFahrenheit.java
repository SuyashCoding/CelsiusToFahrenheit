import java.util.Scanner;

/**
 * converts celsius to fahrenheit
 * @author Suyash Patel
 */
public class CelsiusToFahrenheit {

    /** nine */
    public static final int NINE = 9;

    /** five */
    public static final int FIVE = 5;

    /** thirty two */
    public static final int THIRTY_TWO = 32;

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * NINE / FIVE) + THIRTY_TWO;
        System.out.println("Converted temperature: " + fahrenheit);
        scanner.close();
    }
}

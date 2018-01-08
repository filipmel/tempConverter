package OOP1;

import java.util.Scanner;

public class ConvertTemp {

    Scanner inputTemp = new Scanner(System.in);

    public double convertCtoF() {

        System.out.println("Input Celcius degrees: ");

        double c = inputTemp.nextDouble();

        double outputTemp = (c * 1.8) + 32;

        return outputTemp;
    }

    public double convertFtoC() {

        System.out.println("Input Fahrenheit degrees: ");

        double f = inputTemp.nextDouble();

        double outputTemp = (f - 32) / 1.8;

        return outputTemp;
    }
}

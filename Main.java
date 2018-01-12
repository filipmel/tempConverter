package OOP1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Convert: \n 1) C to F \n 2) F to C \n Enter  1 or 2");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        ConvertTemp Converter = new ConvertTemp();
        ScanIn TempCollector = new ScanIn();
        System.out.println("Input degrees value to be converted: ");
        double inputTemp = TempCollector.getTemp();

        switch (choice) {

            case 1:

                double outputTemp1 = Converter.convertCtoF(inputTemp);
                System.out.format("Fahrenheit degrees: %.2f", outputTemp1);

                break;

            case 2:

                double outputTemp2 = Converter.convertFtoC(inputTemp);
                System.out.format("Celcius degrees: %.2f", outputTemp2);

                break;
        }
    }
}

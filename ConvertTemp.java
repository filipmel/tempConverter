package OOP1;

import java.util.Scanner;

public class ConvertTemp {


    public double convertCtoF(double inputTemp) {

        double outputTemp = (inputTemp * 1.8) + 32;
        return outputTemp;
    }


    public double convertFtoC(double inputTemp) {

        double outputTemp = (inputTemp - 32) / 1.8;
        return outputTemp;
    }
}

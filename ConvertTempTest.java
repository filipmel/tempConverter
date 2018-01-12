package OOP1;

import static org.junit.Assert.*;

public class ConvertTempTest {

    ConvertTemp Tester = new ConvertTemp();

    @org.junit.Test
    public void convertCtoF() {

        double outputTemp = Tester.convertCtoF(30);
        assertEquals(86, outputTemp, 0.0001);
    }

    @org.junit.Test
    public void convertFtoC() {

        double outputTemp = Tester.convertFtoC(86);
        assertEquals(30, outputTemp, 0.0001);
    }
}
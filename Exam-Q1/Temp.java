import java.util.*;
public class Temp {
    public static void main(String[] args) {
        //scan a number
        Scanner in = new Scanner(System.in);
        System.out.print("Give me a Fahrenheit temperature: ");
        double num = in.nextDouble();
        in.close();
        //call fahr2cels from Convert class
        num = Convert.fahr2cels(num);
        System.out.println("In Celsius that would be: " + num);
    }
}

class Convert{
    //takes a double
    public static double fahr2cels(double num) {
        //formula to convert to celcius from fahrenheit
        num = (num - 32.00) / (1.8);
        return num;
    }
}

//--------------------------------------
//note not given but made to run locally
//line 12 is enough to pass on poodle
//--------------------------------------
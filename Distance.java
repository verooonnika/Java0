import java.util.Scanner;

public class Distance {
    double centimeter;
    double meter;
    double kilometer;

    public void convert() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a distance between cities: ");
        centimeter = in.nextDouble();

        meter = centimeter / 100;
        kilometer = centimeter / 100000;

        System.out.printf("The distance between cities is %.2f centimeters (%.2f meters, %.2f kilometers)", centimeter, meter, kilometer);

    }
}

 class Test {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.convert();
    }
    }

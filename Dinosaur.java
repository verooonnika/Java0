import java.util.Scanner;

public class Dinosaur {
    public static void main(String[] args) {
        double masgr;
        double maskg;
        double mascen;
        double ton;

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of grams: ");
        masgr = in.nextDouble();

        maskg = masgr/1000;
        mascen = masgr/100000;
        ton = masgr/1000000;

        System.out.printf("%.2f grams is %.2f kilogram, %.2f centners, %.2f tons", masgr, maskg, mascen, ton);

    }
}
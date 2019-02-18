public class Candy {
   int weightofchocolate = 4;
   int weightofgummy = 5;

    public void calculateCost() {

        double costofchocolate = 25;
        double costofgummy = 34;

        double onekilochoc = costofchocolate/weightofchocolate;
        double onekilogummy = costofgummy/weightofgummy;

        System.out.printf("Cost of 1 kilo of chocolate is %.2f \nCost of 1 kilo of gummy is %.2f\n", onekilochoc, onekilogummy );
        System.out.print(onekilochoc/onekilogummy);

    }
}

 class Test {
    public static void main(String[] args) {
        Candy c1 = new Candy();
        c1.calculateCost();
    }
    }

public class Temperature {
   int radian  = 345;
   double degree ;

    public void convert() {

        degree = radian * 180 / 3.14;
        System.out.printf("%d Radian is %.2f degrees", radian, degree );

    }
}

 class Test {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.convert();
    }
    }
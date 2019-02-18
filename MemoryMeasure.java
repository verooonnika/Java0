import java.util.Scanner;

public class MemoryMeasure {
    int _byte;
    double kilobyte;
    double megabyte;
    double gigabyte;
    double terabyte;

    public void convert() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of bytes: ");
        _byte = in.nextInt();

        kilobyte = _byte / 1024.0;
        megabyte = kilobyte / 1024.0;
        gigabyte = megabyte / 1024.0;
        terabyte = gigabyte / 1024.0;

        System.out.printf("%d bytes is %.5f kilobytes, %.5f megabytes, %.5f gigabytes, %.5f terabytes", _byte, kilobyte, megabyte, gigabyte, terabyte);

    }
}

 class Test {
    public static void main(String[] args) {
        MemoryMeasure m1 = new MemoryMeasure();
        m1.convert();
    }
    }
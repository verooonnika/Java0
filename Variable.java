public class Variable {
   int a = 4;
   int b = 5;

    public void swap() {

        a=a+b-(b=a);
        System.out.printf("New variables are: %d, %d", a, b);

    }
}

 class Test {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        v1.swap();
    }
    }
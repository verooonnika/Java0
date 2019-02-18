public class Triangle
{
    double a = 10;
    double b = 5;
    double c = 5;

    public void CheckTriangle()
    {
        System.out.println(((a+b)>c && (b+c)>a && (a+c)> b)? "Треугольник существует.":"Треугольник не существует.");
    }
}

 class Test
{
    public static void main(String[] args) {

        Triangle tr1 = new Triangle();
        tr1.CheckTriangle();

    }
}
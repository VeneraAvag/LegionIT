public class Variables {
    public static void main(String[] args) {
        //Write a Java program to print 'Hello' on the screen and then print your name on a separate line
        System.out.println("Hello");
        System.out.println("Venera Avagyan");

        //Write a Java program to print the result of the following operations.
        //a. -5 + 8 * 6
        //b. 20 + -3*5 / 8
        int a = -5 + 8 * 6;
        double b = 20 + (double)(-3 * 5) / 8;

        System.out.println(a);
        System.out.println(b);

        //Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:
        //number a * number b *.... equals <result>
        double num1 = 0.25;
        double num2 = 4.09;
        double num3 = 200.5;
        double num4 = 60.6;
        double num5 = 344.222;
        double result = num1 + num2 + num3 + num4 + num5;

        System.out.println(num1 + " * " + num2 + " * " + num3 + " * " + num4 + " * " + num5 + " = " + result);

    }
}

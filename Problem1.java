
import java.util.Scanner;

class Problem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cl = new Calculator();
        System.out.println("Enter two numbers");
        cl.a = sc.nextDouble();
        cl.b = sc.nextDouble();

        System.out.println("Enter one of the operators (+, -, *, /)");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println(cl.add());
                break;
            case "-":
                System.out.println(cl.subtract());
                break;
            case "*":
                System.out.println(cl.multiplication());
                break;
            case "/":
                if (cl.b == 0) {
                    System.out.println("can not divide by zero");
                }
                else{
                    System.out.println(cl.division());
                }
                break;
            default:
                System.out.println("invalid oparator");
        }
        sc.close();
    }
}

class Calculator {

    double a, b;

    public double add() {
        return this.a + this.b;
    }

    public double subtract() {
        return this.a - this.b;
    }

    public double multiplication() {
        return this.a * this.b;
    }

    public double division() {
        return this.a / this.b;
    }
}

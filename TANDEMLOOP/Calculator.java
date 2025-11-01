import java.util.Scanner;
public class Calculator{
    private double num1,num2;
    Calculator(double n1,double n2){
        num1=n1;
        num2=n2;
    }
    void operation(char op){
        switch(op){
            case '+':
                System.out.println(add());
                break;
            case '-':
                System.out.println(subtract());
                break;
            case '*':
                System.out.println(multiply());
                break;
            case '/':
                System.out.println(divide());
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    double add() 
    { 
        return num1 + num2; 
    }

    double subtract() 
    { 
        return num1 - num2; 
    }

    double multiply() 
    { 
        return num1 * num2; 
    }

    double divide() 
    { 
        return num1 / num2; 
    }
}

class Calculatortest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and an operation (+, -, *, /):");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        Calculator calc = new Calculator(a, b);
        calc.operation(op);

        sc.close();
    }
}
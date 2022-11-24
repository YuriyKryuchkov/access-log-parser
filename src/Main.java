import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        System.out.println("Введите первое число и нажмите <Enter>:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число  и нажмите <Enter>:");
        int secondNumber = new Scanner(System.in).nextInt();

        int VResult =  firstNumber+secondNumber;
        System.out.println("Сумма : " + VResult);
        VResult =  firstNumber-secondNumber;
        System.out.println("Разность : " + VResult);
        VResult =  firstNumber*secondNumber;
        System.out.println("Произведение : " + VResult);
        double quotient = (double) firstNumber/secondNumber;
        System.out.println("Частное : " + quotient);
    }
}

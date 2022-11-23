import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        int  firstNumber = 4;
         int secondNumber = 5;
         double quotient = (double) firstNumber/secondNumber;
        System.out.println("Введите первое число и нажмите <Enter>:");
        firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число  и нажмите <Enter>:");
        secondNumber = new Scanner(System.in).nextInt();


        quotient = (double) firstNumber+secondNumber;
        System.out.println("Сумма : " + quotient);
        quotient = (double) firstNumber-secondNumber;
        System.out.println("Разность : " + quotient);
        quotient = (double) firstNumber*secondNumber;
        System.out.println("Произведение : " + quotient);
        quotient = (double) firstNumber/secondNumber;
        System.out.println("Частное : " + quotient);
    }
}

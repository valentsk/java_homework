// Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine
// 3
// +
// 4
// ответ:

// 1 + 2

import java.util.Scanner;

public class ex003 {

    static int SumNum(Integer number_one, Integer number_two) {
        return number_one + number_two;
    }
    static int MinusNum(Integer number_one, Integer number_two) {
        return number_one - number_two;
    }
    static int MultNum(Integer number_one, Integer number_two) {
        return number_one * number_two;
    }
    static int DivNum(Integer number_one, Integer number_two) {
        return number_one / number_two;
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String str_number_one = iScanner.nextLine();

        System.out.print("Введите символ операции (+,-,*,/): ");
        String operat = iScanner.nextLine();

        System.out.print("Введите второе число: ");
        String str_number_two = iScanner.nextLine();

        iScanner.close();

        Integer number_one = Integer.parseInt(str_number_one);
        Integer number_two = Integer.parseInt(str_number_two);
        
        Integer result = null;

        switch (operat){
            case "+":
                result = SumNum(number_one, number_two);
                break;
            case "-": 
                result = MinusNum(number_one, number_two);
                break;
            case "*":
                result = MultNum(number_one, number_two);
                break;
            case "/": 
                result = DivNum(number_one, number_two);
                break;
            default:
                System.out.println("Таких операций не умею");
                break;
            }
      

        System.out.printf(number_one + " " + operat + " " + number_two + " = " + result);

    }

}

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5

import java.util.Scanner;
public class ex001 {

    static int CountNug(Integer number) {
        Integer sum = 0;
        for (Integer i = 1; i < number + 1; i++){
            sum += i;
        }
        return sum;
    }
    
    static int CountFibo(Integer number) {
        Integer fibo = 1;
        for (Integer i = 1; i < number + 1; i++){
            fibo *= i;
        }
        return fibo;
    }  
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        Integer number = iScanner.nextInt();
        iScanner.close();
        
        Integer result_nug = CountNug(number);
        System.out.println("Сумма чисел от 1 до N: " + result_nug);
 
        Integer result_fibo = CountFibo(number);
        System.out.println("Произведение чисел от 1 до N: " + result_fibo);
    }        
}
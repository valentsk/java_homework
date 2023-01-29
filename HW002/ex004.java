// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Date;

import java.util.Scanner;

public class ex004 {

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
    public static void main(String[] args) throws SecurityException, IOException {
        
        Logger logger = Logger.getLogger(ex004.class.getName());
        FileHandler fh = new FileHandler("C:\\temp\\java\\homework\\HW002\\log_ex04.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

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

        Date date = new Date();
        logger.info(date.toString());
        logger.info("Пользователь ввел 1 число = " + number_one);
        logger.info("Пользователь ввел 2 число = " + number_two);
        logger.info("Пользователь ввел оператор " + operat + " " );
        logger.info("Пользователь получил ответ : " + number_one + " " + operat + " " + number_two + " = " + result + "\n");

    }

}

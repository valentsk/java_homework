// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9

import java.util.*;

public class ex03 {

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
        Stack<String> stack = new Stack<>();

        System.out.print("Введите первое число: ");
        String str_number_one = iScanner.nextLine();
        stack.push(str_number_one);

        System.out.print("Введите символ операции (+,-,*,/): ");
        String operat = iScanner.nextLine();
        stack.push(operat);

        System.out.print("Введите второе число: ");
        String str_number_two = iScanner.nextLine();
        stack.push(str_number_two);

        // iScanner.close();

        Integer number_one = Integer.parseInt(str_number_one);
        Integer number_two = Integer.parseInt(str_number_two);

        Integer result = null;

        switch (operat) {
            case "+":
                result = SumNum(number_one, number_two);
                stack.push(result.toString());
                break;
            case "-":
                result = MinusNum(number_one, number_two);
                stack.push(result.toString());
                break;
            case "*":
                result = MultNum(number_one, number_two);
                stack.push(result.toString());
                break;
            case "/":
                result = DivNum(number_one, number_two);
                stack.push(result.toString());
                break;
            default:
                System.out.println("Таких операций не умею");
                break;
        }

        System.out.printf(number_one + " " + operat + " " + number_two + " = " + result);
        System.out.println();

        System.out.println(Arrays.toString(stack.toArray())); // посмотреть стек

        Boolean check = true;

        while (check) {
            System.out.println("Меню: ");
            System.out.println("+ Дальше складываем");
            System.out.println("- Дальше вычитаем");
            System.out.println("* Дальше умножаем");
            System.out.println("/ Дальше делим");
            System.out.println("stop - Отмена последней операции");
            System.out.println("exit - Выход");
            System.out.println("Выбор операции: ");
            String input = iScanner.nextLine();

            switch (input) {
                case "stop":
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    System.out.println(Arrays.toString(stack.toArray())); // посмотреть стек
                    break;
                case "+": // вводим новую операцию и число, записываем в стек
                    String last_result = stack.peek();
                    Integer last_result_int = Integer.parseInt(last_result);
                    System.out.println("Введите число: ");
                    String input_new_number = iScanner.nextLine();
                    Integer input_new_number_int = Integer.parseInt(input_new_number);
                    result = SumNum(last_result_int, input_new_number_int);
                    stack.push("+");
                    stack.push(input_new_number);
                    stack.push(result.toString());
                    System.out.printf(last_result_int + " + " + input_new_number_int + " = " + result);
                    System.out.println();

                    System.out.println(Arrays.toString(stack.toArray())); // посмотреть стек

                    break;

                case "-":
                    String last_result2 = stack.peek();
                    Integer last_result_int2 = Integer.parseInt(last_result2);
                    System.out.println("Введите число: ");
                    String input_new_number2 = iScanner.nextLine();
                    Integer input_new_number_int2 = Integer.parseInt(input_new_number2);
                    result = MinusNum(last_result_int2, input_new_number_int2);
                    stack.push("-");
                    stack.push(input_new_number2);
                    stack.push(result.toString());
                    System.out.printf(last_result_int2 + " - " + input_new_number_int2 + " = " + result);
                    System.out.println();

                    System.out.println(Arrays.toString(stack.toArray())); // посмотреть стек

                    break;
                case "*":
                    String last_result3 = stack.peek();
                    Integer last_result_int3 = Integer.parseInt(last_result3);
                    System.out.println("Введите число: ");
                    String input_new_number3 = iScanner.nextLine();
                    Integer input_new_number_int3 = Integer.parseInt(input_new_number3);
                    result = MultNum(last_result_int3, input_new_number_int3);
                    stack.push("*");
                    stack.push(input_new_number3);
                    stack.push(result.toString());
                    System.out.printf(last_result_int3 + " * " + input_new_number_int3 + " = " + result);
                    System.out.println();

                    System.out.println(Arrays.toString(stack.toArray())); // посмотреть стек

                    break;
                case "/":
                    String last_result4 = stack.peek();
                    Integer last_result_int4 = Integer.parseInt(last_result4);
                    System.out.println("Введите число: ");
                    String input_new_number4 = iScanner.nextLine();
                    Integer input_new_number_int4 = Integer.parseInt(input_new_number4);
                    result = DivNum(last_result_int4, input_new_number_int4);
                    stack.push("/");
                    stack.push(input_new_number4);
                    stack.push(result.toString());
                    System.out.printf(last_result_int4 + " * " + input_new_number_int4 + " = " + result);
                    System.out.println();

                    System.out.println(Arrays.toString(stack.toArray())); // посмотреть стек

                    break;
                case "exit":
                    check = false;
                    break;

                default:
                    System.out.println("Таких операций не умею");
                    break;
            }

        }
        iScanner.close();

    }

}

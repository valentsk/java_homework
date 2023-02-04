// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package homework.HW004;

import java.util.*;
import java.util.Random;

public class ex02 {

    static LinkedList<Integer> CreateListArray(Integer size) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }

    static void ShowListArray(LinkedList<Integer> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
    }

    static LinkedList<Integer> Enqueue(LinkedList<Integer> list) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Помещает элемент в конец очереди: ");
        String input = iScanner.nextLine();
        Integer element = Integer.parseInt(input);
        list.add(element);
        return list;
    }

    static LinkedList<Integer> Dequeue(LinkedList<Integer> list) {
        System.out.print("Возвращает первый элемент из очереди и удаляет его: ");
        Integer element_first = list.get(0);
        System.out.println(element_first);
        list.remove(0);
        return list;
    }

    static LinkedList<Integer> First(LinkedList<Integer> list) {
        System.out.print("Возвращает первый элемент из очереди, не удаляя: ");
        Integer element_first = list.get(0);
        System.out.println(element_first);
        return list;
    }

    static void Menu() {
        System.out.println("Меню: ");
        System.out.println("9 = stop - Выход");
        System.out.println("1 = enqueue() - помещает элемент в конец очереди");
        System.out.println("2 = dequeue() - возвращает первый элемент из очереди и удаляет его");
        System.out.println("3 = first() - возвращает первый элемент из очереди, не удаляя");
        System.out.println("4 = show() - показывает лист");
    }
    public static void main(String[] args) {
        Integer size = 10;
        LinkedList<Integer> list = CreateListArray(size);
        Scanner iScanner = new Scanner(System.in);
        
        Menu();

        Boolean check = true;
        while (check) {
            System.out.println("Выбор операции: ");
            String input = iScanner.nextLine();

            switch (input) {
                case "9":
                    System.out.println("До свидания");
                    check = false;
                    break;
                case "1":
                    list = Enqueue(list);
                    break;
                case "2":
                    list = Dequeue(list);
                    break;
                case "3":
                    list = First(list);
                    break;
                case "4":
                    ShowListArray(list);
                    System.out.println();
                    break;
                default:
                    System.out.println("Таких операций не умею");
                    Menu();
                    break;
            }
        }
    }

}

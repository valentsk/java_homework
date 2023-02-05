
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.*;

public class ex01 {
    static void Menu() {
        System.out.println("Меню: ");
        System.out.println("1 - показать справочник");
        System.out.println("2 - добавить абонента");
        System.out.println("3 - удалить абонента");
        System.out.println("9 - выход");
    }

    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        Map<String, String> map = new HashMap<>();
        
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
                    for (Map.Entry<String, String> pair : map.entrySet()) {
                        String key = pair.getKey();
                        String value = pair.getValue();
                        System.out.println(key + ":" + value);
                    }
                    break;
                case "2":
                    System.out.print("Введите телефон: ");
                    String new_phone = iScanner.nextLine();
                    System.out.print("Введите фамилию и имя: ");
                    String new_man = iScanner.nextLine();
                    map.put(new_phone, new_man);
                    break;
                case "3":
                    System.out.print("Введите удаляемый телефонный номер: ");
                    String new_number = iScanner.nextLine();
                    map.remove(new_number);
                    break;
                default:
                    System.out.println("Таких операций не умею");
                    Menu();
                    break;
            }
        }
    }
}
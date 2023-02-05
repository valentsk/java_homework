// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности Имени.
import java.util.*;

public class ex02 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        String men =    "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова " +
                        "Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова " +
                        "Марина Светлова Мария Савина Мария Рыкова Марина Лугова " +
                        "Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] list_men = men.split(" ");
        for (int i = 0; i < list_men.length; i += 2) {
            if (map.containsKey(list_men[i])) {
                map.put(list_men[i], map.get(list_men[i]) + 1);
            }
            else {
                map.put(list_men[i], 1);
            }
        }
        
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }
        System.out.println("-----------------");

        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
    
        // Set<String> keys = map.keySet();
        // System.out.println("Ключи: " + keys);
 
        // ArrayList<Integer> values = new ArrayList<>(map.values());
        // System.out.println("Значения: " + values);


    }
}

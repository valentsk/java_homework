// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
package homework.HW003;

import java.util.ArrayList;
import java.util.Random;

public class ex02 {
   
    static ArrayList<Integer> CreateListArray(Integer size){
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) 
        {
            list.add(random.nextInt(10));
        }
        return list;
    }

    static void ShowListArray(ArrayList<Integer> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
    }
    
    static ArrayList<Integer> MinMaxAver(ArrayList<Integer> list){  
        Integer sum = 0;
        Integer min_index = 0;
        Integer max_index = 0;
        ArrayList<Integer> list_result = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) 
        {
            if (list.get(i) > list.get(max_index)){
                max_index = i;
            }
            if (list.get(i) < list.get(min_index)){
                min_index = i;
            }
            sum += list.get(i);
        }
        list_result.add(list.get(max_index));
        list_result.add(list.get(min_index));
        list_result.add(sum / list.size());

        return list_result;
    }

    public static void main(String[] args) {
        Integer size = 5;
        ArrayList<Integer> list = CreateListArray(size);
        
        ShowListArray(list);
        System.out.println();

        System.out.println("Максимальное, Минимальное, Ср арифметическое:");
        System.out.println(MinMaxAver(list));

    }
}
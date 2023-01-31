// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа
package homework.HW003;

import java.util.ArrayList;
import java.util.Random;

public class ex01 {

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
    
    static void DeleteEven(ArrayList<Integer> list){  
        for (int i = 0; i < list.size(); i++) 
        {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        Integer size = 10;
        ArrayList<Integer> list = CreateListArray(size);
        
        ShowListArray(list);
        System.out.println();
        DeleteEven(list);
        ShowListArray(list);

    }
}

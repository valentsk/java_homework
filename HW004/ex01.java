// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
package homework.HW004;
import java.util.*;
import java.util.Random;
public class ex01 {
  
    static LinkedList<Integer> CreateListArray(Integer size){
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) 
        {
            list.add(random.nextInt(10));
        }
         return list;
    }

    static void ShowListArray(LinkedList<Integer> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
    }
    
    static LinkedList<Integer> ReturnBack1NewList(LinkedList<Integer> list){  
        LinkedList<Integer> list_back = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) 
        {
           list_back.add(list.get(i));
        }
        return list_back;
    }

    static LinkedList<Integer> ReturnBack2ItList(LinkedList<Integer> list){  
        for (int i = 0; i < list.size() / 2; i++) {
           int temp = list.get(i);
           list.set(i, list.get(list.size() - 1 - i));
           list.set(list.size() - 1 - i, temp);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer size = 5;
        LinkedList<Integer> list = CreateListArray(size);
        
        ShowListArray(list);

        // c новым листом
        System.out.println();
        LinkedList<Integer> list_back2 = ReturnBack1NewList(list);
        ShowListArray(list_back2);

        // c текущим листом       
        System.out.println();
        LinkedList<Integer> list_back = ReturnBack2ItList(list);
        ShowListArray(list_back);

    }
}
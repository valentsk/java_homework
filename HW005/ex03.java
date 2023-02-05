// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. 0x00000 0000x00 00x0000

import java.util.*;

public class ex03 {

    static void ShowArray(Integer[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }


    static Integer[][] CreateArray(Integer size) {
        Random random = new Random();
        Integer[][] array = new Integer[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(2);
            }
        }
        return array;
    }
    
    static Boolean CheckSumArray(Integer[][] array) {
        Boolean check = false;
        Integer sum_j = 0;
        Integer sum_i = 0;

        // проверка строк
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum_j += array[i][j];
            }
            if (sum_j == 1) {
                check = true;
            }
            else {        
                check = false;
                return check;
            }
            sum_j = 0;
        }

        // проверка столбцов
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                sum_i += array[i][j];
            }
            if (sum_i == 1) {
                check = true;
            }
            else {        
                check = false;
                return check;
            }
            sum_i = 0;
        }

        // проверка диагоналей (на одну в сторону)
        for (int i = 1; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[i][j] == array[i + 1][j + 1] || array[i][j] == array[i + 1][j - 1] || array[i][j] == array[i - 1][j + 1] || array[i][j] == array[i - 1][j - 1]) {
                    check = false;
                    return check;
                }
                else {
                    check = true;
                }
            }
        }

        return check;
    }
    public static void main(String[] args) {
        
        Integer size = 8;
        Integer[][] array = CreateArray(size);
        
        ShowArray(array);
        System.out.println();

        long timeStart = System.currentTimeMillis();
        
        Integer count =1;
        while (CheckSumArray(array) != true) {
            System.out.println("Попытка номер: " + count);
            array = CreateArray(size);
            // System.out.println(CheckSumArray(array));
            // ShowArray(array);
            System.out.println("------------------");
            count++;
        }

        long timeFinish = System.currentTimeMillis();
        System.out.print("Время: ");
        System.out.println(timeFinish - timeStart);
        System.out.println("------------------");
        ShowArray(array);

        // подходит итог:
        //   01234567
        // 0 xooooooo
        // 1 ooxooooo
        // 2 ooooxooo
        // 3 ooooooxo
        // 4 oxoooooo
        // 5 oooxoooo
        // 6 oooooxoo
        // 7 ooooooox

        // 0;0
        // 1;2
        // 2;4
        // 3;6
        // 4;1
        // 5;3
        // 6;5
        // 7;7

    }
}
// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Arrays;
import javax.print.attribute.Size2DSyntax;

public class ex001 {
    
    static void ShowArray(Integer[] array) {
        for (Object x : array) {
            System.out.print(x + " ");
        }
    }

    static Integer[] CreateArray(Integer size){
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    static Integer[] BubbleArray(Integer[] array) throws SecurityException, IOException {
        
        Logger logger = Logger.getLogger(ex001.class.getName());
        FileHandler fh = new FileHandler("C:\\temp\\java\\homework\\HW002\\log_ex01.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        Date date = new Date();
        
        logger.info("Начальный массив: " + Arrays.toString(array));
                
        for (Integer i = 0; i < array.length - 1; i++){
            for (Integer j = 0; j < array.length - 1 - i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    
                    logger.info(array[j] + " поменяли местами с " + array[j + 1] + ". С позиции " + j + " на позицию " + (j + 1));
                    logger.info("Текущий массив при i = " + i + " и j = " + j + ": " + Arrays.toString(array));
                }
            }
        }

        logger.info("Конечный массив: " + Arrays.toString(array));

        return array;
    }
           
    public static void main(String[] args) throws SecurityException, IOException {
    
        Integer size = 10;
        Integer[] array = CreateArray(size);
        
        ShowArray(array);
        System.out.println();

        BubbleArray(array);
        ShowArray(array);

    }
}

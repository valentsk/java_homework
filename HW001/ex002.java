// Вывести все простые числа от 1 до 1000


public class ex002 {

    static void LookSimple() {
        Integer max_number = 1000;
        Integer count = 2; // для единицы и самого себя
        for (Integer i = 1; i < max_number + 1; i++){
            for (Integer j = 2; j < i; j++){
                if (i % j == 0){
                    count++; // при нахождении первого встретившегося делителя (кроме 1 и самого себя) выходим из цикла, число непростое
                    break;
                }
            }
            
            if (count == 2){
                System.out.print(i+" ");
            }
            count = 2;
        }
        
    }      
    public static void main(String[] args) {
        LookSimple();
    }
}

import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите N:");
        Integer number = iScanner.nextInt();
        iScanner.close();
        System.out.printf("Для n треугольника: " + number);
        System.out.println();
        System.out.printf("Для n!: " + number);

    }        
    
}
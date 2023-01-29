// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class ex003 {
    
    static Boolean Palindrom(String text) {
        
        text = text.toLowerCase();
        text = text.replace(" ", "");

        Boolean result = true;
        for (Integer i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        String text1 = "palindrom";
        String text2 = "arozaupalanalapuazora"; // А роза упала на лапу Азора
        String text21 = "A roza upala na lapu Azora"; // А роза упала на лапу Азора
        String text3 = "pallap"; // четное число символов
        String text4 = "Radar"; // нечетное число символов


        System.out.printf(text1 + " - " + Palindrom(text1) + "\n");
        System.out.printf(text2 + " - " + Palindrom(text2) + "\n");
        System.out.printf(text21 + " - " + Palindrom(text21) + "\n");
        System.out.printf(text3 + " - " + Palindrom(text3) + "\n");
        System.out.printf(text4 + " - " + Palindrom(text4) + "\n");

    }
}

// Дана json строка (читать из файла и сохранить в файл) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через обычный текстовый файл!!!)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
// "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Если .txt
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex002 {

    static void ParseFile(String text) {
        StringBuilder sb = new StringBuilder();
        text = text.replace("[^а-яА-Я]", "");
        System.out.println(text);

        // String[] text_array = text.split("[^а-яА-Я]");
        String[] text_array = text.split(" ");

        // for (Object x : text_array)
        // {
        //     System.out.print(x + " ");
        // }


    }

    public static void main(String[] args) throws IOException {

        String text1 = "{'фамилия':'Иванов','оценка':'5','предмет':'Математика'}\n";
        String text2 = "{'фамилия':'Петрова','оценка':'4','предмет':'Информатика'}\n";
        String text3 = "{'фамилия':'Краснов','оценка':'5','предмет':'Физика'}\n";

        FileWriter file = new FileWriter("C:\\temp\\java\\homework\\HW002\\json_ex02.txt");
        file.write(text1);
        file.write(text2);
        file.write(text3);
        file.close();



        BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\java\\homework\\HW002\\json_ex02.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line).append("\n");
            line = br.readLine();
        }
        String fileAsString = sb.toString();
        System.out.println(fileAsString);


        ParseFile(fileAsString);
    }

}

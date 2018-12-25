package Note_2_topic_2;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        //Task 2.......................................................................................................
        System.out.println("Task 2");
        String s = "// шестнадцатеричная система исчисления\n" +
                "b = 0x0f;   // 15 в десятичной системе исчисления\n" +
                "sh = 0XAF;  // 175\n" +
                "d = 0xabcd; // 43981\n" +
                "l = 0XaF90FCDEDl; // 47128235501";
        Pattern p = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(m.group());
        }
        System.out.println();


        //Task 3........................................................................................................
        System.out.println("Task 3");
        String s2 = "1. Html тег <p></p> (для абзацев)\n" +
                "<p></p> — выводит текстовый абзац (допускает атрибуты style, class, id). Самый распространенный тег, поскольку в него чаще всего помещают текст (впрочем он для этого и создан).\n" +
                "\n" +
                "Например, html код:\n" +
                "\n" +
                "<p>Текстовый абзац номер один</p>\n" +
                "<p>А это другой абзац</p>\n" +
                "Преобразуется на странице в следующее:\n" +
                "\n" +
                "Текстовый абзац номер один\n" +
                "\n" +
                "А это другой абзац\n" +
                "\n" +
                "К тегу можно ещё приписать параметр style:\n" +
                "\n" +
                "<p style=\"стиль\"></p>\n" +
                "С помощью этих различных значений можно редактировать внешний вид текста. Про эти параметры можно прочитать в отдельном уроке: стили в html и свойство css font.\n" +
                "\n" +
                "Также можно прописать атрибуты CLASS и ID. Например:\n" +
                "\n" +
                "<p class=\"style1\"></p>\n" +
                "<p id=\"id_style1\"></p>\n" +
                "<p class=\"style1\" id=\"id_style1\"></p>";
        System.out.println(s2.replaceAll("<p .+\">", "<p>"));
        System.out.println();


        //Task 4........................................................................................................
        System.out.println("Task 4");
        Locale locale = new Locale("uk","UA");
        System.out.println(locale.getDisplayCountry());
        NumberFormat nM = NumberFormat.getCurrencyInstance(locale);
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        Number num  = null;
        try {
            num = numberFormat.parse("153,5");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        double n = num.doubleValue();
        System.out.println(nM.format(n));
    }
}

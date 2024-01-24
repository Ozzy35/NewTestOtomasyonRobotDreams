package Lesson14AnotasyonlarGenericTiplerAkislarStreams.Odev10StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

    public static void main(String[] args) {
        filterInStreams();

    }
    public static void filterInStreams() {
        List<String> list = new ArrayList<>();

        list.add("Özge");
        list.add("Gabriela");
        list.add("Peccuni");
        list.add("Nikolay");
        list.add("Peppe");
        list.add("Alex");

        list.stream().filter(word -> word.startsWith("P")).forEach(System.out::println);

    }
}




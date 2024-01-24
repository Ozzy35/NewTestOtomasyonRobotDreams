package Lesson14AnotasyonlarGenericTiplerAkislarStreams.StreamAPIOperasyonlarOzzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Veri {

    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(12,44,45,66,22,33,21,24,23,70,65);
        Stream<Integer> sayilarA=sayilar.stream();
        Stream<Integer> kirkSekizdenKucukSayilar = sayilarA.filter(s -> s <48);

        kirkSekizdenKucukSayilar.forEach(s-> System.out.println(s+"\n"));
//2.ornek
        List<String> ad =new ArrayList<>();

        ad.add("Özge");
        ad.add("Gabriela");
        ad.add("Peccuni");
        ad.add("Nikolay");
        ad.add("İvelina");
        ad.add("Alex");

        System.out.println("");
        ad.stream().limit(4).forEach(System.out::println);
// 3.cu ornek

        ArrayList<Integer> s =new ArrayList<>();
        s.add(4);
        s.add(4);
        s.add(5);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(2);
        System.out.println("");
        System.out.println("");
        System.out.println(s);
s.stream().distinct().forEach(System.out::println);



    }
}

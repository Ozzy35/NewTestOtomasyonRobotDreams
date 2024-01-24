package Lesson14AnotasyonlarGenericTiplerAkislarStreams.Functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

public class test {
    public static void main(String[] args) {

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt();
        System.out.println(randomSupplier.get());
    }
}
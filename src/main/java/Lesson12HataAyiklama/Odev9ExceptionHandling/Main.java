package Lesson12HataAyiklama.Odev9ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void mekanKontrolu(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();
        } else
            System.out.println("Mekana hoşgeldiniz.......");
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz....");
        int yas = scanner.nextInt();

        try {
            mekanKontrolu(yas);

        } catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez.....");
        }
    }
}

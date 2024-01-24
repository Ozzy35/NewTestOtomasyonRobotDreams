package Lesson12HataAyiklama.OzzyExceptionHandlingistisnaYakalama;

import java.util.Scanner;

//istedğimiz zaman kendi exceptionlarımız fırlatabılıyoruz throw anahtar kelime ile
//mekana gırı seklınde bır metod yazıcak olursak eger yasımız 18 den kuccuken exception
// fırlatılmasını ıstıyorsak throw anahtar kelımesı ıle kendızmı fırlatabılrıız
public class ThrowAnahtarKelimesi {
    public static void mekanKontrol(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();
        } else {
            System.out.println("Mekana hoşgeldiniz........");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz..........");
        int yas = scanner.nextInt();

        try {
            mekanKontrol(yas);
        } catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez......");
        }
    }
}
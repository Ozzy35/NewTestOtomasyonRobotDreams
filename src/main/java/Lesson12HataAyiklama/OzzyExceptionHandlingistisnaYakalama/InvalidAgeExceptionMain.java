package Lesson12HataAyiklama.OzzyExceptionHandlingistisnaYakalama;

import java.util.Scanner;

public class InvalidAgeExceptionMain {
    public static void mekanKontrol(int yas){
        if (yas<18){
            throw new InvalidAgeException("Invalid Age");
        }
        else {
            System.out.println("Mekana Hoşgeldiniz......");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz :  ");
        int yas =scanner.nextInt();
        try {
            mekanKontrol(yas);
        }
        catch (InvalidAgeException e){
            e.printStackTrace();
        }



    }
}

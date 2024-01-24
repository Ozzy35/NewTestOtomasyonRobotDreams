package Lesson15JavaUygulamasiTasarimi.Odev11JavaTasarimi.SingletonPattern;

public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {
        SingletonOrnegi ornek1 = SingletonOrnegi.getInstance();
        SingletonOrnegi ornek2= SingletonOrnegi.getInstance();


        ornek1.degerArttir(1);
        ornek2.degerArttir(5);

        System.out.println(ornek1.getDeger());

        SingletonOrnegi ornek3 =SingletonOrnegi.getInstance();
        ornek3.degerArttir(10);
        System.out.println(ornek2.getDeger());


    }
}

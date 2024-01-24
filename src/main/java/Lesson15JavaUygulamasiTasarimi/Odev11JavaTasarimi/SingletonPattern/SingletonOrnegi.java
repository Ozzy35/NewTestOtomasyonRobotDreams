package Lesson15JavaUygulamasiTasarimi.Odev11JavaTasarimi.SingletonPattern;

public class SingletonOrnegi {
    private static SingletonOrnegi benzersizOrnek =null;
    private static int deger= 0;

    private SingletonOrnegi() {

    }
    public static SingletonOrnegi getInstance(){
        if (benzersizOrnek == null){
            benzersizOrnek= new SingletonOrnegi();
        }
        return benzersizOrnek ;


    }

    public static int getDeger() {
        return deger;
    }

    public  int degerArttir(int i){
        return deger =deger + i;
    }

}

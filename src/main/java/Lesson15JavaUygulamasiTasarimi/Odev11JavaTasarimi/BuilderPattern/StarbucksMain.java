package Lesson15JavaUygulamasiTasarimi.Odev11JavaTasarimi.BuilderPattern;

import Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy.Basbakan;
import Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy.BasbakanlikKalemi;
import Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy.GercekBasbakan;
import Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy.Vatandas;

import java.util.Locale;

public class StarbucksMain {
    public static  void main(String[] args) {
        StarbucksBuilder sb = new StarbucksBuilder.Builder("Small").yumuşakİçenler("Orta Yumuşak")
                .build();

        System.out.println(sb);


    }

}


package Lesson14AnotasyonlarGenericTiplerAkislarStreams.Annotations;

public @interface Ogrenci {
    int id();
    String adi();
    String soyadi() default "Cura";
}
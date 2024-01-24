package Lesson14AnotasyonlarGenericTiplerAkislarStreams.AnnotationsWithRetention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Ogrenci {
    int id();
    String adi();
    String soyadi() default "Cura";
}
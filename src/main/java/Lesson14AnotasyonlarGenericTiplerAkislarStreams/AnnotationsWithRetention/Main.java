package Lesson14AnotasyonlarGenericTiplerAkislarStreams.AnnotationsWithRetention;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        RdTestAutomation rdTestAutomation = new RdTestAutomation();

        Class<?> sinif = rdTestAutomation.getClass();
        Annotation[] ekBilgiler = sinif.getAnnotations();

        for(Annotation bilgi: ekBilgiler) {
            System.out.println(bilgi);
        }
    }
}
package Lesson12HataAyiklama.OzzyExceptionHandlingistisnaYakalama;
//Stacklerle Beraber Exceptionlarin Ic Ice Metodlarda Yakalanma Mantigi
public class ExceptionPropagation {

    public static void ucuncuFonksiyon(){
        //ucuncu fonksoyıonda exceptın var yakalamamız devam edıyor,
        // ilk adımda try catchıle hatayı yakaladık java programımız sorunsuz devam edıyor
        //ic ice metodlarda Stack'ler kullanıyor ıc ıce
        try {
            int a =12/0;
        }catch (ArithmeticException e){
            System.out.println("Bir sayı sıfıra bölünemez.....");
        }

    }
    public static void ikinciFonsiyon(){
        ucuncuFonksiyon();
    }
    public static void birinciFonksiyon(){
        ikinciFonsiyon();

    }

    public static void main(String[] args) {
      birinciFonksiyon();
    }
}

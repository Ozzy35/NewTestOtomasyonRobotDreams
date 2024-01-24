package Lesson12HataAyiklama.OzzyExceptionHandlingistisnaYakalama;

public class OzzyFinallyBlogu {
    public static void main(String[] args) {

        try{
          int a =30/0;
//            System.out.println(s.hashCode()); // metod cagırıyoruz s herhangi bir veri göstermıyor ve Null pointer exception hatası cıkıyor
        }
        catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez....");
        }
        catch (NullPointerException e){
            System.out.println("Null Referans Hatası..........."); //catch ila hatayı yakalıyoruz
        }
        finally {   //finally blok yazıyoruz
            System.out.println("finally bloğu çalışıyor......"); //fınally blogu mutlaka calsıyor her durumda
// ornekde 1.  exception oldu 1,catct calıstı Catch ile hatayı yakaldık vfinally blogu mutlaka calıstı ve
// son sout da calıstı programınızın calısmayı durdurmasını engelledık

        }
    }

    public static class OzzyTryVeCatchBloklari {
        public static void main(String[] args) {
    //        int[] a={1,2,3,4,5};
    //        System.out.println(a[6]); //ArrayIndexOutOfbOUND EXCEPTİON HATASİ
    //
    //        int a =30 /0; //Unchecked Exception
    //        System.out.println("Burası çalışıyor...."); //Kod çalışmadı

    //        EXCEPTİON NASIL YAKALANIR ?

            try {
              //  int a =30/0; //AritmeticException
                int [] a= {1,2,3,4,5};
                System.out.println(a[6]);
                int b =30/0;
            }
           catch (ArithmeticException e) {
               System.out.println("Bir sayı sıfıra bölünemez");
           }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Arrayın boyunu aştınız.....");
            }

            catch (Exception e){
            System.out.println("Bir hata oluştu......");
            e.printStackTrace();

            }
            System.out.println("Burası çalışıyor......");
        }
        }
}

//package Lesson12HataAyiklama.Lesson12Odev9;
//
//
//public class Main {
//    public Main() {
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz....");
//        String sartlar = "Yurtdışı Çıkış Kuralları...\nHerhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\nGideceğiniz ülkeye vizenizin bulunması gerekiyor...";
//        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
//
//        while(true) {
//            Yolcu yolcu;
//            while(true) {
//                while(true) {
//                    System.out.println("*******************************************");
//                    System.out.println(sartlar);
//                    System.out.println("*******************************************");
//                    yolcu = new Yolcu();
//                    System.out.println("Harç Bedeli Kontrol Ediliyor...");
//                    Thread.sleep(3000L);
//
//                    try {
//                        yolcu.yurtdisiHarciKontrol();
//                        break;
//                    } catch (HarcException var5) {
//                        var5.printStackTrace();
//                    }
//                }
//
//                System.out.println("Siyasi Yasak Kontrol Ediliyor...");
//                Thread.sleep(3000L);
//
//                try {
//                    yolcu.siyasiYasakKontrol();
//                    break;
//                } catch (SiyasiException var6) {
//                    var6.printStackTrace();
//                }
//            }
//
//            System.out.println("Vize Durumu Kontrol Ediliyor...");
//            Thread.sleep(3000L);
//
//            try {
//                yolcu.vizeDurumuKontrol();
//                break;
//            } catch (VizeException var7) {
//                var7.printStackTrace();
//            }
//        }
//
//        System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
//    }
//}

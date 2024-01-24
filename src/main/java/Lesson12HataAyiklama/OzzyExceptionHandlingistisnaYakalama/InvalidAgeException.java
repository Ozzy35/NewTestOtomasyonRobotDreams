package Lesson12HataAyiklama.OzzyExceptionHandlingistisnaYakalama;
//checked ve uncked class uretıyoruz
//EXTENDS İLE ARITMETICEXCEPTİON ıcındekı metodlar otomatık gelıyor
// fakat kendımıze gore yazmak ıstıyorsak ınsert code overrıde dıyerek overırde edıyoruz
public class InvalidAgeException extends ArithmeticException{
    public InvalidAgeException(String message){
        super(message); //super yazarak bu mesajımzı ustekı constroktora gonderıyoruz 1 tane artımetıc exceptıon ve arıtmetık cass yazdık
    }

    @Override
    public void printStackTrace() { //stacktarce kendımız yazmak ıstıyoruz
        System.out.println("Bu bir invalid age hatasıdır........");
    }
}

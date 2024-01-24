package Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy;

public class Vatandas {
    private Basbakan basbakan;

    public Vatandas(BasbakanlikKalemi kalem) {
        this.basbakan = kalem.banaBasbakaniVer();
    }

    public String derdiniAnlat() {
        this.basbakan.dertDinle("Bir derdim var...");
        return "Yasasiiinnn!!!";
    }

    public String isIste() {
        this.basbakan.isBul("Oglum");
        return "Yasasiiinnn!!!";
    }
}
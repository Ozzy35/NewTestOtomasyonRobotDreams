package Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy;

public class GercekBasbakan implements Basbakan {
    public GercekBasbakan() {
    }

    public void dertDinle(String dert) {
        System.out.println("Basbakan: Dinliyorum.");
    }

    public void isBul(String yakinim) {
        System.out.println("Basbakan: Bana boyle isteklerle gelmeyin.");
    }
}

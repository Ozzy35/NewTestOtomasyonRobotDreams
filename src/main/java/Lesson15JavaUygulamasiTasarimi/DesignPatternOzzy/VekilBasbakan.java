package Lesson15JavaUygulamasiTasarimi.DesignPatternOzzy;

public class VekilBasbakan implements Basbakan {
    private Basbakan gercekBasbakan;

    public VekilBasbakan(Basbakan gercekBasbakan) {
        this.gercekBasbakan = gercekBasbakan;
    }

    public void dertDinle(String dert) {
        System.out.println("Vekil: Derdinizi dinliyorum.");
        boolean ayiklandi = this.ayikla(dert);
        if (ayiklandi) {
            this.ilet(dert);
        }

    }

    public void isBul(String yakinim) {
        System.out.println("Vekil: Isteginizi dinliyorum.");
    }

    private boolean ayikla(String dert) {
        boolean b = true;
        return b;
    }

    private void ilet(String dert) {
        this.gercekBasbakan.dertDinle(dert);
    }
}
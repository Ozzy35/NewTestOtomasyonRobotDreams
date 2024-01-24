package Lesson15JavaUygulamasiTasarimi.Odev11JavaTasarimi.BuilderPattern;

public class StarbucksBuilder {
    //Gerekli
    private String kahveBoyutu;
    //secime gore degısır
    private String laktozssuzSütMiktarı;
    private String yumuşatıcı;

    public static class Builder {
        //Gerekli
        private final String kahveBoyutu;
        private String laktozssuzSütMiktarı;
        private String yumuşatıcı;

        public Builder(String kahveBoyutu) {
            super();
            this.kahveBoyutu = kahveBoyutu;
        }

        public Builder laktozssuzTayfa(String laktozssuzSut) {
            laktozssuzSütMiktarı = laktozssuzSut;
            return this;
        }

        public Builder yumuşakİçenler(String yumuşakDeğer) {

            yumuşatıcı = yumuşakDeğer;
            return this;

        }

        public StarbucksBuilder build() {

            return new StarbucksBuilder(this);
        }

    }

    public StarbucksBuilder(Builder builder) {
        kahveBoyutu = builder.kahveBoyutu;
        laktozssuzSütMiktarı = builder.laktozssuzSütMiktarı;
        yumuşatıcı = builder.yumuşatıcı;

    }

    @Override
    public String toString() {
        return "Ozzy Siparis{" +
                "Kahve Boyutu ='" + kahveBoyutu + '\'' +
                ", Sertlik ='" + yumuşatıcı + '\'' +

                '}';
    }
}




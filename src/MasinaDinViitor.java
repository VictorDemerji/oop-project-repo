public class MasinaDinViitor extends Masina {

    boolean masinaZboara;
    String combustibil;

    public MasinaDinViitor(String marca,
                           String model,
                           double motorizare,
                           int year,
                           String segment,
                           boolean masinaZboara,
                           String combustibil)
    {
        super(marca, model, motorizare, year, segment);
    }
}

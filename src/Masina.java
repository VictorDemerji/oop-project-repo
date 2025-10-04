public class Masina {
    //motorizare, putere, caroserie, tractiune, model, marca, an,
    // clasa, combustibil, culoare, greutate

    String marca;
    String model;
    double motorizare;
    int    year;
    String segment;


    public Masina(String marca, String model, double motorizare, int year, String segment) {
        this.marca      = marca;
        this.model      = model;
        this.motorizare = motorizare;
        this.year       = year;
        this.segment    = segment;

    }

    public void pornesteMotorul(String marca) {
        System.out.println("Motorul masinii" + marca + " porneste...");
    }

    public void merge(String marca) {
        System.out.println("Masina merge pe traseu...");
    }

    public void accelereaza(String marca) {
        System.out.println("Masina accelereaza...");
    }
}

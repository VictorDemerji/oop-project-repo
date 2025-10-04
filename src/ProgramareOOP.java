public class ProgramareOOP {
    public static void main(String[] args) {

        Masina masina1 = new Masina("BMW", "G30", 2.0, 2022, "Premium");
        Masina masina2 = new Masina("Audi", "A6", 2.0, 2019, "Premium");
        Masina masina3 = new Masina("Volvo", "XC40", 2.0, 2021, "Premium");

        MasinaDinViitor primaMasina = new MasinaDinViitor(
                "Volkswagen",
                "Golf",
                1.9,
                2067,
                "Comfort",
                true,
                "apa"
        );

//        masina1.marca      = "Mercedes";
//        masina1.model      = "GLE";
//        masina1.motorizare = 3.0;
//        masina1.year       = 2018;
//        masina1.segment    = "Premium";

        System.out.println(masina1.marca);
        System.out.println(masina1.model);
        System.out.println(masina1.motorizare);
        System.out.println(masina1.year);
        System.out.println(masina1.segment);
        System.out.println();
        System.out.println();
        System.out.println();
        masina1.pornesteMotorul(masina1.marca);
        masina1.merge(masina1.marca);
        masina1.accelereaza(masina1.marca);


        System.out.println();
        System.out.println();
        System.out.println();

        masina1.merge(masina1.marca);
        primaMasina.merge(primaMasina.marca);

    }
}
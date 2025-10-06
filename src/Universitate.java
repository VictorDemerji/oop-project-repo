import java.util.Scanner;
import java.time.Year;

public class Universitate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Intrare in program...");
        System.out.print("Introducere facultate (Matematica / Informatica): ");
        String facultate = scanner.nextLine();
        System.out.println("A fost aleasa Facultatea " + facultate + ".");

        System.out.print("Doriti sa introduceti studenti noi? (Da/Nu): ");
        String raspuns = scanner.nextLine();

        if (raspuns.equalsIgnoreCase("Nu")) {
            System.out.println("Iesire din program...");
            return;
        }

        System.out.print("Creati numele grupei noi: ");
        String grupa = scanner.nextLine();
        System.out.println("Introducerea studentilor grupei " + grupa);

        System.out.print("Introduceti numele studentului 1: ");
        String nume = scanner.nextLine();

        System.out.print("Introduceti anul nasterii studentului: ");
        int anulNasterii = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Student: " + nume + ", Varsta: " + (Year.now().getValue() - anulNasterii) + " ani");

        System.out.print("Introduceti specialitate (Algebra/Geometrie/Calcul_Integral): ");
        String specialitate = scanner.nextLine();
        System.out.println("A fost aleasa specialitatea " + specialitate + ".");

        System.out.print("Introduceti nota test1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introduceti nota test2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introduceti nota examen: ");
        double notaExamen = scanner.nextDouble();

        System.out.println("----- Rezultate finale -----");
            System.out.println("Student: " + nume + ", Varsta: " + (Year.now().getValue() - anulNasterii) + " ani");
            System.out.println("Specialitate: " + specialitate);
            double media = (nota1 + nota2 + notaExamen) / 3.0;
            System.out.println("Media studentului este: " + media);
            if (media > 9) {
                System.out.println("Esti promovat!");
            } else {
                System.out.println("Nu ati trecut cu brio, incercati in semestrul urmator!");
            }

        System.out.println("Iesire din program...");
    }
}

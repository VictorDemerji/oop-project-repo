package pack2;

public class Doi {
//    final int c = 100;
//
//    public static void main(String[] args) {
//        Doi obiect1 = new Doi();
//        System.out.println(obiect1.c);
//        // obiect1.c = 500;
//        System.out.println(obiect1.c);
//    }

    int number = 800;

    public static void main(String[] args) {
        Doi obj1 = new Doi();
        Doi obj2 = new Doi();
        Doi obj3 = new Doi();

        obj1.number = 300;
        obj2.number = 400;

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
    }
}

package B1_Dévellopement.Applicatif.Exercices.Module_4;

public class Motif_12_bis {
    public static void motif_12(int size) {

        for (int line = 1; line <= size; line++) {
            for (int border_h = 1; border_h<= size; border_h++) {
                System.out.print("+===");
            }
            System.out.println("+");

            for (int column = 1; column <= size; column++) {
                for (int border_v = 1; border_v <= size; border_v++) {
                    System.out.print("|   ");
                }
                System.out.println("|");
            }
        }
        for (int border_h = 1; border_h<= size; border_h++) {
            System.out.print("+===");
        }
        System.out.println("+");
    }
}

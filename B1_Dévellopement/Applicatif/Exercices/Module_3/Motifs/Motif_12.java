package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_12 {
    public static void main(String[] args) {
        for (int line = 1; line <= 2; line++) {
            for (int border_h = 1; border_h<= 2; border_h++) {
                System.out.print("+===");
            }
            System.out.println("+");

            for (int border_v = 1; border_v <= 3; border_v++) {
                for (int j = 1; j <= 2; j++) {
                    System.out.print("|   ");
                }
                System.out.println("|");
            }
        }
        for (int border_h = 1; border_h<= 2; border_h++) {
            System.out.print("+===");
        }
        System.out.println("+");
    }
}
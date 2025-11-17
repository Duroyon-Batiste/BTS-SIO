package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_8 {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++) {
            for (int digit = 9; digit >= 0; digit--) {
                for (int repeat = 0; repeat < 5; repeat++) {
                    System.out.print(digit);
                }
            }
            System.out.println();
        }
    }
}

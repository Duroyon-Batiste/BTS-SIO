package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_9 {
    public static void main(String[] args) {
        for (int line = 0; line < 4; line++) {
            for (int digit = 9; digit >= 1; digit--) {
                for (int repeat = 0; repeat < digit; repeat++) {
                    System.out.print(digit);
                }
            }
            System.out.println();
        }
    }
}

package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_7 {
    public static void main(String[] args) {
        for (int line = 0; line < 3; line++) {
            for (int digit = 0; digit < 10; digit++) {
                for (int repeat = 0; repeat < 3; repeat++) {
                    System.out.print(digit);
                }
            }
            System.out.println();
        }
    }
}

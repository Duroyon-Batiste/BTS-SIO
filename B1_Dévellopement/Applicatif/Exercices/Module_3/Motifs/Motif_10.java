package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_10 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int dash = 1; dash <= 5 - row; dash++) {
                System.out.print("-");
            }
            for (int num = 1; num <= 2 * row - 1; num++) {
                System.out.print(row * 2 - 1);
            }
            for (int dash = 1; dash <= 5 - row; dash++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

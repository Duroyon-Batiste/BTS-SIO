package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_6 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= row; num++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }
}

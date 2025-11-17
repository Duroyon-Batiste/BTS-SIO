package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_13 {
    public static void main(String[] args) {
        int width = 32;

        for (int line = 0; line < 5; line++) {
            System.out.print("/".repeat((width - (line*8)) / 2));
            System.out.print("*".repeat(line * 8));
            System.out.print("\\".repeat((width - (line*8)) / 2));
            System.out.println();
        }
    }
}

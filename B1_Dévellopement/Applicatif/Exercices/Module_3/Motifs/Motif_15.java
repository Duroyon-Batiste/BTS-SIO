package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_15 {
    public static void main(String[] args) {
        int width = 26;
        for (int line = 0; line < 7; line++) {
            System.out.print("*".repeat(((width - 12) / 2) - (line + 1)));
            System.out.print(" ".repeat(line + 1));
            System.out.print("/".repeat((width - 14) - (line * 2)));
            System.out.print("\\".repeat(line * 2));
            System.out.print(" ".repeat(line + 1));
            System.out.print("*".repeat(((width - 12) / 2) - (line + 1)));
            System.out.println();
        }
    }
}

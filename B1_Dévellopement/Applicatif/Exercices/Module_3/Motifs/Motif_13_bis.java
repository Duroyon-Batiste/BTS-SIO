package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

import java.util.Scanner;

public class Motif_13_bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la taille du motif : ");
        int size = clavier.nextInt();
        clavier.close();

        int width = (size - 1) * 8;

        for (int line = 0; line < size; line++) {
            System.out.print("/".repeat((width - (line*8)) / 2));
            System.out.print("*".repeat(line * 8));
            System.out.print("\\".repeat((width - (line*8)) / 2));
            System.out.println();
        }
    }
}

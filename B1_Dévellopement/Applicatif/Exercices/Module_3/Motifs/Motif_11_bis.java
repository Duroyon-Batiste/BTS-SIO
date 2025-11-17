package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

import java.util.Scanner;

public class Motif_11_bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la taille du motif (nombre pair) : ");
        int size = clavier.nextInt();
        clavier.close();

        int width = (size - 1) * 4 + 2;

        for (int start = 0; start < ((width)/2); start++) {
            System.out.print("\\".repeat(start));
            System.out.print("!".repeat(width - (start * 2)));
            System.out.print("/".repeat(start));
            System.out.println();
            start++;
        }     
    }
}


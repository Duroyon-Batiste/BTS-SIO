package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

import java.util.Scanner;

public class Motif_16_bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombre de marches : ");
        int size = clavier.nextInt();
        clavier.close();

        int width = size * 5;

        for (int step = 1; step <= (width / 5); step++) {
            System.out.print(" ".repeat(width - (step * 5)));
            System.out.print("  o  ");
            System.out.print("*".repeat(6));
            System.out.println(" ".repeat((step - 1) * 5) + "*");

            System.out.print(" ".repeat(width - (step * 5)));
            System.out.print(" /|\\ ");
            System.out.print("*");
            System.out.println(" ".repeat(step * 5) + "*");

            System.out.print(" ".repeat(width - (step * 5)));
            System.out.print(" / \\ ");
            System.out.print("*");
            System.out.println(" ".repeat(step * 5) + "*");
        }
        System.out.print("*".repeat(width + 7));
    }
}

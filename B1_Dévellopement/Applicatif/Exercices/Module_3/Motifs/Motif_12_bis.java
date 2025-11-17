package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

import java.util.Scanner;

public class Motif_12_bis {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la taille du motif : ");
        int size = clavier.nextInt();
        clavier.close();

        for (int line = 1; line <= size; line++) {
            for (int border_h = 1; border_h<= size; border_h++) {
                System.out.print("+===");
            }
            System.out.println("+");

            for (int column = 1; column <= size; column++) {
                for (int border_v = 1; border_v <= size; border_v++) {
                    System.out.print("|   ");
                }
                System.out.println("|");
            }
        }
        for (int border_h = 1; border_h<= size; border_h++) {
            System.out.print("+===");
        }
        System.out.println("+");
    }
}

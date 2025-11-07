package B1_Dévellopement.Applicatif.Exercices.Module_3;

import java.util.Scanner;

public class Motif_17_bis {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la taille du motif : ");
        int size = clavier.nextInt();
        clavier.close();

        for (int antenne_line = 0; antenne_line < size; antenne_line++) {
            System.out.println(" ".repeat(3 * size)+"||");
        }
        
        for (int sphere_top_line = 0; sphere_top_line < size; sphere_top_line++) {
            System.out.print(" ".repeat(((size * 3) - 3)-(sphere_top_line * 3)));
            System.out.print("__/");
            System.out.print(":".repeat((sphere_top_line * 3)));
            System.out.print("||");
            System.out.print(":".repeat((sphere_top_line * 3)));
            System.out.println("\\__");
        }

        System.out.println("|" + "\"".repeat(((3 * size) * 2)) + "|");
        
        if (size % 2 == 0) {
            for (int sphere_bottom_line = 0; sphere_bottom_line < size; sphere_bottom_line++) {
                System.out.print(" ".repeat(sphere_bottom_line * 2));
                System.out.print("\\_/");
                System.out.print("\\/".repeat(((size)*2) + (size - sphere_bottom_line * 2 - 2)));
                System.out.println("\\_/");
        }} else {
            for (int sphere_bottom_line = 0; sphere_bottom_line < size; sphere_bottom_line++) {
                System.out.print(" ".repeat(sphere_bottom_line * 2));
                System.out.print("\\_/");
                System.out.print("\\/".repeat(((size - 1)/2) + (size - sphere_bottom_line - 1)));
                System.out.print("\\/");
                System.out.print("\\/".repeat(((size - 1)/2) + (size - sphere_bottom_line - 1)));
                System.out.println("\\_/");
            }
        }
        

        for (int fin_pilier_line = 0; fin_pilier_line < size; fin_pilier_line++) {
            System.out.println(" ".repeat(3 * size)+"||");
        }

        for (int large_pilier_line = 0; large_pilier_line < (size * 4); large_pilier_line++) {
            if (size % 2 != 0) {
                int pillar_size = size - 1;
                System.out.print(" ".repeat((size * 3) - ((size / 2 )+ 1)));
                System.out.print("|");
                System.out.print("%".repeat(pillar_size / 2));
                System.out.print("||");
                System.out.print("%".repeat(pillar_size / 2));
                System.out.println("|");
            } else {
                int pillar_size = size;
                System.out.print(" ".repeat((size * 3) - ((size / 2 )+ 1)));
                System.out.print("|");
                System.out.print("%".repeat(pillar_size / 2));
                System.out.print("||");
                System.out.print("%".repeat(pillar_size / 2));
                System.out.println("|");
            }// S'assure que la taille est paire pour le pilier
        }

        for (int base_line = 0; base_line < size; base_line++) {
            System.out.print(" ".repeat(((size * 3) - 3)-(base_line * 3)));
            System.out.print("__/");
            System.out.print(":".repeat((base_line * 3)));
            System.out.print("||");
            System.out.print(":".repeat((base_line * 3)));
            System.out.println("\\__");
        }

        System.out.println("|" + "\"".repeat(((3 * size) * 2)) + "|");


}}
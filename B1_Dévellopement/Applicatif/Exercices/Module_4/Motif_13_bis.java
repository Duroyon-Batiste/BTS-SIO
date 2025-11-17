package B1_Dévellopement.Applicatif.Exercices.Module_4;

public class Motif_13_bis {
    public static void motif_13(int size) {
        
        int width = (size - 1) * 8;

        for (int line = 0; line < size; line++) {
            System.out.print("/".repeat((width - (line*8)) / 2));
            System.out.print("*".repeat(line * 8));
            System.out.print("\\".repeat((width - (line*8)) / 2));
            System.out.println();
        }
    }
}

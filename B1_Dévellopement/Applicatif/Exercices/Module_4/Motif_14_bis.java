package B1_Dévellopement.Applicatif.Exercices.Module_4;

public class Motif_14_bis {
    public static void motif_14(int size) {

        int width = size * 4;
        
        for (int line = 0; line < size; line++) {
            System.out.print("*".repeat(line * 2));
            System.out.print("&".repeat((width / 4) - line));
            System.out.print("*".repeat((width / 2) - (line*2)));
            System.out.print("&".repeat((width / 4) - line));
            System.out.print("*".repeat(line * 2));
            System.out.println();
        }
    }
}

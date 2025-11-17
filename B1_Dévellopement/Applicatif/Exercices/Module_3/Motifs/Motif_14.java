package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_14 {
    public static void main(String[] args) {
        int width = 28;
        
        for (int line = 0; line < 7; line++) {
            System.out.print("*".repeat(line * 2));
            System.out.print("&".repeat((width / 4) - line));
            System.out.print("*".repeat((width / 2) - (line*2)));
            System.out.print("&".repeat((width / 4) - line));
            System.out.print("*".repeat(line * 2));
            System.out.println();
        }
    }
}

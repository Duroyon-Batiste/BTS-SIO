package B1_Dévellopement.Applicatif.Exercices.Module_4;

public class Motif_11_bis {
    public static void Motif_11(int size) {

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


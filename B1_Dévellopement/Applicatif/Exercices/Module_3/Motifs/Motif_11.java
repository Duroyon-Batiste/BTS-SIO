package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_11 {
    public static void main(String[] args) {
        int width = 22;
        for (int start = 0; start < ((width)/2); start++) {
            System.out.print("\\".repeat(start));
            System.out.print("!".repeat(width - (start * 2)));
            System.out.print("/".repeat(start));
            System.out.println();
            start++;
            }
            
        }
    }



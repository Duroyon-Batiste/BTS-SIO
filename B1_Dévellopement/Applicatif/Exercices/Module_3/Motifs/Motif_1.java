package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_1 {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.print("_-^-");
        }

        System.out.println();

        int nb = 1;
        for (int j = 1; j <= 20; j++) {
            if (nb == 10) {
                nb = 0;
            }
            System.out.print(nb);
            System.out.print(nb);
            nb = nb + 1;
        }

        System.out.println();

        for (int i = 1; i <= 40; i++) {
            System.out.print("-");
        }
    }
}
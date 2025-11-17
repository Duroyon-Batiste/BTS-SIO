package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_16 {
    public static void main(String[] args) {
        int width = 25;

        for (int step = 1; step <= (width / 5); step++) {
            System.out.print(" ".repeat(25 - (step * 5)));
            System.out.print("  o  ");
            System.out.print("*".repeat(6));
            System.out.println(" ".repeat((step - 1) * 5) + "*");

            System.out.print(" ".repeat(25 - (step * 5)));
            System.out.print(" /|\\ ");
            System.out.print("*");
            System.out.println(" ".repeat(step * 5) + "*");

            System.out.print(" ".repeat(25 - (step * 5)));
            System.out.print(" / \\ ");
            System.out.print("*");
            System.out.println(" ".repeat(step * 5) + "*");
        }
        System.out.print("*".repeat(32));
    }
}

package B1_Dévellopement.Applicatif.Exercices.Module_4;

public class Motif_16_bis {
    public static void motif_16(int size) {

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

package B1_Dévellopement.Applicatif.Exercices.Module_3.Motifs;

public class Motif_17 {
    public static void main(String[] args) {
        for (int antenne_line = 0; antenne_line < 4; antenne_line++) {
            System.out.println(" ".repeat(3 * 4)+"||");
        }
        
        for (int sphere_top_line = 0; sphere_top_line < 4; sphere_top_line++) {
            System.out.print(" ".repeat((12 - 3)-(sphere_top_line * 3)));
            System.out.print("__/");
            System.out.print(":".repeat((sphere_top_line * 3)));
            System.out.print("||");
            System.out.print(":".repeat((sphere_top_line * 3)));
            System.out.println("\\__");
        }

        System.out.println("|" + "\"".repeat(((3 * 4) * 2)) + "|");
        
        for (int sphere_bottom_line = 0; sphere_bottom_line < 4; sphere_bottom_line++) {
            System.out.print(" ".repeat(sphere_bottom_line * 2));
            System.out.print("\\_/");
            System.out.print("\\/".repeat(((5 * 4) / 2) - (sphere_bottom_line * 2)));
            System.out.println("\\_/");
        }

        for (int fin_pilier_line = 0; fin_pilier_line < 4; fin_pilier_line++) {
            System.out.println(" ".repeat(3 * 4)+"||");
        }

        for (int large_pilier_line = 0; large_pilier_line < (4 * 4); large_pilier_line++) {
            System.out.print(" ".repeat(12 - ((4 / 2 )+ 1)));
            System.out.print("|");
            System.out.print("%".repeat(4 / 2));
            System.out.print("||");
            System.out.print("%".repeat(4 / 2));
            System.out.println("|");
        }

        for (int base_line = 0; base_line < 4; base_line++) {
            System.out.print(" ".repeat((12 - 3)-(base_line * 3)));
            System.out.print("__/");
            System.out.print(":".repeat((base_line * 3)));
            System.out.print("||");
            System.out.print(":".repeat((base_line * 3)));
            System.out.println("\\__");
        }

        System.out.println("|" + "\"".repeat(((3 * 4) * 2)) + "|");
    }
}

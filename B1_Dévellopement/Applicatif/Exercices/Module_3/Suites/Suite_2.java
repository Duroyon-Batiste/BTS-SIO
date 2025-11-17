package B1_Dévellopement.Applicatif.Exercices.Module_3.Suites;

public class Suite_2 {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int temp = 1;
        for (int i = 1; i <= 17; i++) {
            System.out.print(a + " ");
            a = a + temp;
            temp = a - temp;
        }
        System.out.print("...");
    }
}
import java.util.Scanner;

public class main {

    public static void main(final String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Veuillez saisir la limite : ");
            int Limit = scanner.nextInt();
            System.out.println(Eratosthene.Crible(Limit));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

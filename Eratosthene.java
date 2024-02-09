import java.util.ArrayList;
import java.util.List;

public class Eratosthene {

    public static List CribleEratosthene(int limite) {
        ArrayList<Integer> L = new ArrayList<Integer>();
        for (int i = 2; i <= limite; i++) {
            L.add(i);
        }

        ArrayList<Integer> Resultat = new ArrayList<>();

        while(!L.isEmpty() && (L.get(0) * L.get(0)) <= limite) {
            Resultat.add(L.get(0));
            L.removeIf(n -> n % L.get(0) == 0);
        }

        Resultat.addAll(L);
        return Resultat;
    }

    public static ArrayList<Integer> Crible(int limite) {
        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> R = new ArrayList<Integer>();
        int i;
        for(i=2; i<=limite; i++) {
            L.add(i);
        }

        int max = (int)Math.ceil(Math.sqrt(limite));

        while (L.size()>0 && L.get(0) <= max) {
            int p = L.remove(0);
            R.add(p);
            enleve_multiple(p, L);
        }
        // Ajoutez le reste des nombres dans L à R, car ils sont tous premiers
        R.addAll(L);

        return R;
    }

    public static void enleve_multiple(int nombre, ArrayList<Integer> liste) {
        int index = 0;

        while (index < liste.size()) {
            int multiple = liste.get(index);

            // Vérifiez si l'élément est un multiple du nombre donné
            if (multiple % nombre == 0 && multiple != nombre) {
                // Supprimez le multiple de la liste
                liste.remove(index);
            } else {
                // Passez au prochain élément
                index++;
            }
        }
    }



}

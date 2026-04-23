//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;

        // Créer le scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        int essaisMax = 10;
        int essais = 0;
        boolean gagne = false;

        System.out.println("___ Jeu du nombre à deviner ___");
        System.out.println("Devinez un nombre entre 1 et 100.");
        System.out.println("Vous avez 10 essais pour le trouver !");

        // Boucle principale du jeu
        while (essais < essaisMax) {

            essais++;
            System.out.println("\nEssai " + essais + "/" + essaisMax);
            System.out.print("Entrez votre nombre : ");

            // Lire le nombre entré par l'utilisateur
            int proposition = scanner.nextInt();

            // Comparer la proposition au nombre secret
            if (proposition == nombreSecret) {
                // L'utilisateur a trouvé le bon nombre
                gagne = true;
                break;
            } else if (proposition < nombreSecret) {
                System.out.println("Trop petit ! Le nombre est plus grand.");
            } else {
                System.out.println("Trop grand ! Le nombre est plus petit.");
            }
        }

        // Affichage du résultat final
        if (gagne) {
            System.out.println("\n Félicitations Vous avez gagné! Nombre trouvé :  " + nombreSecret + " en " + essais + " essai(s) !");
        } else {
            System.out.println("\n Perdu ! Le nombre secret était : " + nombreSecret);
        }

        // Fermer le scanner
        scanner.close();
    }
}
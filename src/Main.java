import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreSecret = random.nextInt(100) + 1;

        // Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        int essais = 0;

        System.out.println("Devinez un nombre entre 1 et 100.");
        System.out.println("Vous avez 10 essais !");

        // Boucle qui demande à l'utilisateur de deviner
        while (essais < 10) {

            essais++;
            System.out.print("Entrez votre nombre : ");

            // Lire l'entrée et comparer au nombre aléatoire
            int proposition = scanner.nextInt();

            if (proposition == nombreSecret) {
                // Bon nombre → fin de boucle → gagné
                System.out.println("Félicitations ! Vous avez gagné !");
                scanner.close();
                return;
            } else if (proposition < nombreSecret) {
                // Indiquer si inférieur
                System.out.println("Trop petit !");
            } else {
                // Indiquer si supérieur
                System.out.println("Trop grand !");
            }
        }

        // 10 essais utilisés → fin de boucle → perdu
        System.out.println("Perdu ! Le nombre secret était : " + nombreSecret);
        scanner.close();
    }
}
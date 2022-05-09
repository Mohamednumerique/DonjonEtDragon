import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int getPlayerPosition() {
        int playerPosition = 1;
        Dee dee = new Dee();


        while (playerPosition < 64) {
            System.out.println("------------------------");;
            System.out.println("pour jeter le dée appuyer sur 1)");
            Scanner scanner = new Scanner(System.in);
            int lancerDee = 0;

            //exeption
            try{
                lancerDee = scanner.nextInt();  // Read user input
                scanner.nextLine();
            }catch(InputMismatchException e){
                System.out.println("TAPEZ UNE DES REPONSES POSSIBLES");
            }

            int jetDeDee = 0;
            if(lancerDee == 1){
                jetDeDee = dee.jetterDe();
                System.out.println("dé: "+jetDeDee);
            }

            playerPosition += jetDeDee;
            System.out.println("position: "+playerPosition);
        }

        return playerPosition;
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.demarrage();
        String nameHero = menu.nameChoice();
        menu.persoChoice(nameHero);
        menu.readyToPlay();
        System.out.println("on commence la partie");
        boolean finDuGame = true;
        //démarage de la partie
        while(finDuGame ) {
            int playerPosition = getPlayerPosition();
            System.out.println("Vous ètes le Boss du royaume de DONJONS & DRAGONS");
            System.out.println("Tapez 1) pour recommencer");
            System.out.println("Tapez 2) pour quitter");
            Scanner scanner = new Scanner(System.in);
            int fin = scanner.nextInt();  // Read user input
            scanner.nextLine();
            if (fin == 2){
                finDuGame = false;
            }
        }

        }

    }











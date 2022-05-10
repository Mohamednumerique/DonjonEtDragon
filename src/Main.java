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
            try {
                playerPosition += jetDeDee;
                System.out.println("position: "+playerPosition);
            }catch (Exception e){

            }

        }

        return playerPosition;
    }

    private static int move(int origine) throws PersonnageHorsPlateauException{
        Dee dee = new Dee();
        int jetDeDee = dee.jetterDe();
        int newPosition = origine + jetDeDee;
        if(newPosition >= 64) {
            throw new PersonnageHorsPlateauException();
        }
        return newPosition;
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.demarrage();
        String nameHero = menu.nameChoice();
        menu.persoChoice(nameHero);
        menu.readyToPlay();
        System.out.println("on commence la partie");
        boolean finDuGame = true;
        int playerPosition = 0;

        // Déplacement dans le jeu
        while (playerPosition < 64){
            try {
                playerPosition = move(playerPosition);
            } catch (PersonnageHorsPlateauException e) {
                System.out.println(e.getMessage());
                playerPosition = 64;
            }
            System.out.println(playerPosition);
        }

        //fin de la partie
        while(finDuGame ){
            System.out.println("Vous ètes le Boss du royaume de DONJONS & DRAGONS");
            System.out.println("Tapez 1) pour recommencer");
            System.out.println("Tapez 2) pour quitter");
            Scanner scanner = new Scanner(System.in);
            int fin = scanner.nextInt();  // Read user input
            scanner.nextLine();
            if (fin == 2){
                finDuGame = false;
            }
            if (fin == 1){
                getPlayerPosition();
            }
        }

        }

    }











import java.util.Scanner;
public class Menu {
//démarer le jeux
    public void demarrage(){
        System.out.println("----------------------------------------------");;
        System.out.println("Bienvenue dans le Royaume de Donjon et Dragon vous, un monde ou allez trop vite canné");
    }
//quitter le jeux
    public void exit(){
        System.out.println("Vous avez RAGEQUITE");
        System.exit(0);


    }

//choisir le nom de son personnage
    public String nameChoice(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("----------------------------------------------");;
        System.out.println("Tapez \"exit\" pour quitter le GAME");
        System.out.println("-------");;
        System.out.println("Entrez le nom du héro");

        String playerName = scanner.nextLine();  // Read user input

        if(playerName.equals("exit")){
            exit();

        }



        System.out.println("----------------------------------------------");;
        System.out.println("Le nom de votre héro sera: " + playerName);  // Output user input

        return playerName;

}
//choisir entre le grerrier ou le magicien
    public String persoChoice(String name){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        boolean persoOk = false;

         while(!persoOk){
             System.out.println("----------------------------------------------");;
             System.out.println("Tapez 1) pour choisir le Guerrier");  // Output user input
             System.out.println("Tapez 2) pour choisir le Magicien");
             System.out.println("Tapez 3) pour quitter le GAME");



             int persoChoice = scanner.nextInt();  // Read user input
             scanner.nextLine();

             if (persoChoice == 1) {
                 Guerrier guerrier = new Guerrier(name, 5, 5);
                 System.out.println("----------------------------------------------");;
                 System.out.println("vous avez choisis le guerrier " + guerrier);
                 persoOk = true;
             }
             if (persoChoice == 3){
                 exit();
             }
             else if (persoChoice == 2) {
                 Magicien magicien = new Magicien(name, 5, 5);
                 System.out.println("----------------------------------------------");
                 System.out.println("vous avez choisis le magicien " + magicien);
                 persoOk = true;

             }
         }

        return "check";
    }
    //commencer la partie
    public boolean readyToPlay(){
        boolean readyOk = false;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        while (!readyOk){
            System.out.println("----------------------------------------------");
            System.out.println("Tapez 1) pour entrès dans le Game");
            System.out.println("Tapez 2) si vous avais peur");
            int ready = scanner.nextInt();  // Read user input
            scanner.nextLine();

            if (ready == 1){
                readyOk = true;
                System.out.println("Bienvenue dans le Dans le monde de DONJONS ET DRAGONS");
            }
            if (ready == 2){
                exit();
            }

    }
        return readyOk;
}

};
import java.util.Scanner;
public class Menu {

    public void demarrage(){
        System.out.println("Bienvenue dans le Royaume de Donjon et Dragon vous allez trop vite canné");
    }
    public String nameChoice(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Entrer le nom du héro");

        String playerName = scanner.nextLine();  // Read user input
        System.out.println("Le nom de votre héro sera: " + playerName);  // Output user input
        return playerName;
}
    public String persoChoice(String name){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        boolean persoOk = false;

         while(!persoOk){
             System.out.println("Tapez 1 pour choisir le Guerrier");  // Output user input
             System.out.println("Tapez 2 pour choisir le Magicien");;


             int persoChoice = scanner.nextInt();  // Read user input
             scanner.nextLine();

             if (persoChoice == 1) {
                 Guerrier guerrier = new Guerrier(name, 5, 5);
                 System.out.println("vous avez choisis le guerrier " + guerrier);
                 persoOk = true;
             }
             else if (persoChoice == 2) {
                 Magicien magicien = new Magicien(name, 5, 5);
                 System.out.println("vous avez choisis le magicien " + magicien);
                 persoOk = true;

             }
         }

        return "check";
    }
    //menu oui ou non modif attribu
    public int modifierAttribu(){
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Voulez vous changer les statistique de votre hero");
            System.out.println("1/ oui");
            System.out.println("2/ non");


        int attribu = scanner.nextInt();  // Read user input
        scanner.nextLine();
        if (attribu == 1){
            System.out.println();
        }



        System.out.println("Username is: " + attribu);  // Output user input

        return attribu;
    }
}

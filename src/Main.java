public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.demarrage();
        String nameHero = menu.nameChoice();
        menu.persoChoice(nameHero);

    }}


public class Game {
        Dee dee = new Dee();
        int playerPosition = 0;
        public  int jouer_un_tour(){
            Dee dee = new Dee();

            int jetDeDee = dee.jetterDe();
            int newPosition = playerPosition + jetDeDee;
            

        }

}


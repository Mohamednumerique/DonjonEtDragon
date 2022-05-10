public class Magicien extends Personnage  {

    // Attributs

//    private String nom;
//    private int vie;
//    private int attaque;

    private String philtre;

    // Les constructeurs

    public Magicien(String mNom, int mvie, int mAttaque) {
        super(mNom, mvie, mAttaque);
    }
    public Magicien() {
        super("mohamed", 10, 15);

    }
    public Magicien(String mNom) {
        super(mNom, 10, 15);

    }

    //geter & setter
//    public String getNom() {
//        return this.nom;
//    }
//    public int getVie() {
//        return this.vie;
//    }
//    public int getAttaque() {
//        return this.attaque;
//    }
//
//    public String toString(){
//        return this.nom;
//    }

}


public class Guerrier extends Personnage {

    // Attributs

    private String nom;
    private int vie;
    private int attaque;

    // Les constructeurs

    public Guerrier(String mNom, int mvie, int mAttaque) {
        super(mNom, mvie, mAttaque);
//        this.nom = mNom;
//        this.vie = mvie;
//        this.attaque = mAttaque;
   }
    public Guerrier() {
        super("mohamed", 6 , 15);

//        this.nom = "mohamed";
//        this.vie = 6;
//        this.attaque = 15;
    }
    public Guerrier(String mNom) {
        super(mNom,6,15);
//        this.nom = mNom;
//        this.vie = 6;
//        this.attaque = 15;
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
//
//
//    public String toString(){
//        return this.nom;
//    }


   }

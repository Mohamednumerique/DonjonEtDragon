public class Guerrier {

    // Attributs

    private String nom;
    private int vie;
    private int attaque;

    // Les constructeurs

    public Guerrier(String mNom, int mvie, int mAttaque) {
        this.nom = mNom;
        this.vie = mvie;
        this.attaque = mAttaque;
    }
    public Guerrier() {
        this.nom = "mohamed";
        this.vie = 6;
        this.attaque = 15;
    }
    public Guerrier(String mNom) {
        this.nom = mNom;
        this.vie = 6;
        this.attaque = 15;
    }


    //geter & setter
    public String getNom() {
        return this.nom;
    }
    public int getVie() {
        return this.vie;
    }
    public int getAttaque() {
        return this.attaque;
    }



    public String toString(){
        return this.nom;
    }


   }

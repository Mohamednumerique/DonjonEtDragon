public class Magicien {

    // Attributs

    private String nom;
    private int vie;
    private int attaque;
    private String philtre;

    // Les constructeurs

    public Magicien(String mNom, int mvie, int mAttaque) {
        this.nom = mNom;
        this.vie = mvie;
        this.attaque = mAttaque;
    }
    public Magicien() {
        this.nom = "mohamed";
        this.vie = 10;
        this.attaque = 15;
    }
    public Magicien(String mNom) {
        this.nom = mNom;
        this.vie = 10;
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

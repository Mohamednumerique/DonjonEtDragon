public class Personnage {

// Attributs

    private String nom;

    private int vie;

    private int attaque;



// Les constructeurs

    public Personnage(String mNom, int mvie, int mAttaque) {
        this.nom = mNom;
        this.vie = mvie;
        this.attaque = mAttaque;
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

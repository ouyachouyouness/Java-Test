public class Note {
    //--------Attributs-------------
    private float valeur;
    private int coefficient;
    //-------------Le constructeur---------------
    public Note(float valeur, int coefficient) {
        this.valeur = valeur;
        this.coefficient = coefficient;
    }
    //---------Les getters et setters ---------------
    public float getValeur() {
        return valeur;
    }
    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
    public int getCoefficient() {
        return coefficient;
    }
    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
    //-----------------------------------------------
    public String toString() {
        return this.valeur + " ---> " + this.coefficient;
    }

}

import java.util.ArrayList;

public class Etudiant {
    //--------Attributs-------------
    private String nom;
    private ArrayList<Note> notes;
    //-------------Le constructeur---------------
    public Etudiant(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<Note>();
    }
    //---------Les getters et setters ---------------
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
    // ------------Traiter les notes---------------------
    public void ajouterNote(Note note) {
        notes.add(note);
    }
    public void supprimerNote(Note note) {
        notes.remove(note);
    }
    public void supprimerNote(int indice) {
        notes.remove(indice);
    }
    //-----------Autres méthodes-----------------------
    public int getNbreNotes() {
        return notes.size();
    }
    public float getFaibleNote() {
        float min = notes.get(0).getValeur();
        for(Note note : notes) {
            if(note.getValeur() < min) min = note.getValeur();
        }
        return min;
    }
    public float getSupNote() {
        float max = notes.get(0).getValeur();
        for(Note note : notes) {
            if(note.getValeur() > max) max = note.getValeur();
        }
        return max;
    }
    public float calcMoyenne() {
        float somme = 0;
        int sommeCoef=0;
        for(Note note : notes) {
            somme += note.getValeur() * note.getCoefficient();
            sommeCoef += note.getCoefficient();
        }
        return somme/sommeCoef;
    }
    //------Afficher la liste des notes---------
    public void afficheNotes() {
        System.out.println("---La liste des notes de "
                + this.nom + " sont:");
        for(Note note : notes) {
            System.out.println("------ " + note);
        }
    }
    //-------Afficher les statistiques---------
    public void afficheStat() {
        System.out.println(" Le relevé de notes de "
                + this.nom + " est:");
        System.out.println(" ----- Nombre de notes = "
                + this.getNbreNotes());
        System.out.printf(" ----- Moyenne = %.2f\n",
                this.calcMoyenne());
        System.out.printf(" ----- Note faible = %.2f\n",
                this.getFaibleNote());
        System.out.printf(" ----- Note sup = %.2f\n",
                this.getSupNote());
    }
}



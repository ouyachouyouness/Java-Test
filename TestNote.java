import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class TestNote {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Ali");
        // Initialisation de la liste des notes
                System.out.println("Initialisation de la liste des notes:" );
        // On peut initialiser une ArrayList de plusieurs façons:
        /* 1- Créer un tableau des objets Note, puis utiliser la
        méthode Arrays.asList() pour l'assigner à une ArrayList:*/
        /*
         Note[] notesTab = new Note[] {new Note(16,1), new
         Note(15.3f,2)};
         ArrayList<Note> notes =
         new ArrayList<Note>(Arrays.asList(notesTab));
         e1.setNotes(notes);
         e1.afficheNotes();
        */
                /* 2- Utiliser la méthode add():*/
        /* ArrayList<Note> notes = new ArrayList<Note>();
         notes.add(new Note(12,1));
         notes.add(new Note(12.5f,2));
         notes.add(new Note(13.5f,2));

         Note n1 = new Note(8,1);
         notes.add(n1);

         e1.setNotes(notes);
         e1.afficheNotes();
        */
                /* 3- Utiliser, directement, la méthode Arrays.asList():*/
        /* ArrayList<Note> notes = new ArrayList<Note>
         (Arrays.asList(new Note(16,1), new Note(15.3f,2)));
        e1.setNotes(notes);
        e1.afficheNotes();
        */
// 4- Utiliser la méthode List.of():
        ArrayList<Note> notes = new ArrayList<>(List.of(new Note(16,1),
                new Note(15.3f,2)));
        e1.setNotes(notes);
        e1.afficheNotes();
//Ajouter une note à la liste
        System.out.println();
        System.out.println("Ajout de la note: " + new Note(10 , 3) );
        e1.ajouterNote(new Note(10 , 3));
        e1.afficheNotes();
//ou bien
        System.out.println();
        Note n2 = new Note(8,2);
        System.out.println("Ajout de la note: " + n2 );
        e1.ajouterNote(n2);
        e1.afficheNotes();
//Supprimer une note de la liste
        System.out.println();
        System.out.println("Suppression de la note: " + n2 );
        e1.supprimerNote(n2);
        e1.afficheNotes();
//Ou bien
        System.out.println();
        System.out.println("Suppression de la note d'indice 2: "
                + e1.getNotes().get(2));
        e1.supprimerNote(2);
        e1.afficheNotes();
//Afficher les statistiques
        System.out.println();
        e1.afficheStat();
    }
}




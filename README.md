# <h1>Java-Test</h1>
 application that allows you to manage the grades of a student
On souhaite créer une application qui permet de gérer les notes d’un étudiant pour un 
module. Le programme comportera trois classes : Etudiant, Note et TestNotes.
1. Créer les classes suivantes :
La classe Note possède les membres suivants : 
• Deux attributs privés : note (valeur de la note) de type float et coefficient de type int.
• Un constructeur permettant de créer un objet Note.
• Les setters et les getters : pour accéder et modifier les attributs d’un objet Note.
• String toString(): pour afficher un objet Note sous la forme suivante :
La classe Etudiant possède les membres suivants : 
• Deux attributs privés : nom de type String et notes de type arrayList<Note>.
• Un constructeur permettant d’initialiser un objet Etudiant par son nom.
• Les setters et les getters.
• void ajouterNote(Note n): pour ajouter un objet Note à la collection notes.
• void supprimerNote(Note n) et void supprimerNote(int indice) : pour supprimer un
objet Note de la collection notes.
• int getNbreNotes() : pour donner le nombre de notes d’un étudiant
• float getFaibleNote() et float getSupNote(): pour donner la note faible et supérieure
d’un étudiant.
• float calcMoyenne() : pour calculer la moyenne d’un étudiant.
• void afficheNotes() : pour afficher les notes d’un étudiant.
Créer une classe TestNotes pour tester les deux classes.
 
 <h3>Affichage</h3>

 ```---La liste des notes de Ali sont:
------ 16.0 ---> 1
------ 15.3 ---> 2

Ajout de la note: 10.0 ---> 3
---La liste des notes de Ali sont:
------ 16.0 ---> 1
------ 15.3 ---> 2
------ 10.0 ---> 3

Ajout de la note: 8.0 ---> 2
---La liste des notes de Ali sont:
------ 16.0 ---> 1
------ 15.3 ---> 2
------ 10.0 ---> 3
------ 8.0 ---> 2

Suppression de la note: 8.0 ---> 2
---La liste des notes de Ali sont:
------ 16.0 ---> 1
------ 15.3 ---> 2
------ 10.0 ---> 3

Suppression de la note d'indice 2: 10.0 ---> 3
---La liste des notes de Ali sont:
------ 16.0 ---> 1
------ 15.3 ---> 2

 Le relevé de notes de Ali est:
 ----- Nombre de notes = 2
 ----- Moyenne = 15,53
 ----- Note faible = 15,30
 ----- Note sup = 16,00
```

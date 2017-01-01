public class exo4 {
public static void main(String[] args) {

int nombreLignes = 10; //nombre de ligne de notre triangle

for (int ligne=0; ligne<=nombreLignes; ligne++) { //boucle pour chaque ligne
int chiffre =1; //variable chiffre initialisé à 1
  System.out.print(chiffre); // on affiche chiffre=1 à chaque début de ligne

  for (int colonne=1; colonne<=ligne; colonne++) { //boucle pour chaque colonne

    chiffre = chiffre * (ligne-colonne+1)/colonne; //calcul de la valeur de chiffre
    System.out.print(chiffre + " "); //affichage du chiffre
  }
  System.out.println(); //ligne suivante
}

}
}

import java.util.Scanner;
public class exo8 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //on initialise une saisie clavier
        System.out.println("Tapez le nombre de ligne que fera le triangle :");
        int nombreLignes = sc.nextInt(); //variable nombreLignes contient le nombre de lignes
        sc.nextLine();
        String lettre ="";
        while(lettre.length()==0) {
        System.out.println("Quelle caractère vous voulez pour dessiner le triangle : ");
        lettre = sc.nextLine();  //variable lettre contient le caractère pour dessiner le triangle
        System.out.println(); }

        for (int ligne=0; ligne<=nombreLignes; ligne++) { //boucle pour chaque ligne

                System.out.print(lettre + " "); // on affiche chiffre=1 à chaque début de ligne

                for (int colonne=1; colonne<=ligne; colonne++) { //boucle pour chaque colonne

                        System.out.print(lettre + " "); //affichage du chiffre
                }
                System.out.println(); //ligne suivante
        }

}
}

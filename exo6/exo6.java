import java.util.Scanner;
public class exo6 {
public static void main(String[] args) {
        String str = ""; //variable str qui contiendra ce que coco repète
while(!str.equals("q")) { //on boucle tant que l'utilisateur ne veut pas quitter
        Scanner sc = new Scanner(System.in); //on initialise une saisie clavier
        System.out.println("Merci de saisir un mot (tapez q pour quitter) :"); //on attends la saisie utilisateur
        str = sc.nextLine(); // on stock la saisie dans str
        if (str.length() == 0) System.out.println("Merci de saisir un mot (tapez q pour quitter) :"); // si la chaine est vide on repose la question
        else { System.out.println("Coco le perroquet répète : " + str); // sinon coco répète
        System.out.println(); }
}
System.out.println("Coco vous dit au revoir ! "); //message d'aurevoir
}
}

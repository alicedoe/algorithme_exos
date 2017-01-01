import java.util.Scanner;
import java.util.regex.Pattern; //import methode pattern
import java.util.regex.Matcher; //import methode matcher
public class exo7 {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //on initialise une saisie clavier
        System.out.println("Tapez un mot ou une phrase :");
        String mot = sc.nextLine(); //string mot contient la saisie utilisateur
        mot = mot.toLowerCase(); //on transforme mot en minuscule
        mot = mot.trim(); //on enlève les les séparateurs en début fin de ligne
        String phrase = mot.replaceAll("\\s", ""); //on stock dans la avriable phrase mot sans espaces
        int choix=0; // variable choix qui contiendra le choix du menu
        while(choix != 6) { //tant que l'utilisateur ne veut pas quitter le menu revient
                System.out.println();
                System.out.println("Votre mot ou phrase est : " + mot );
                System.out.println("Faites votre choix :" );
                System.out.println("1. Vérifier si le mot est un palindrome");
                System.out.println("2. Compter le nombre de lettre dans le mot");
                System.out.println("3. Remplacer un caractère par un autre");
                System.out.println("4. couper le mot");
                System.out.println("5. changer de mot");
                System.out.println("6. quitter");
                choix = sc.nextInt(); //variable choix contient la saisie utilisateur

//Choix 1 : Palindrome, test si mot est un palindrome ou pas

                switch(choix) {

                case 1:

                        StringBuffer mot_palin = new StringBuffer(phrase); //variable mot_palin = mot
                        StringBuffer mot_palin2 = new StringBuffer(phrase); //variable mot_palin2 = mot
                        mot_palin.reverse(); // on inverse les lettres de mot_palin
                        if (mot_palin.toString().equals(mot_palin2.toString())) { //si mot_palin est idem que mot_palin2
                                System.out.println(mot + " est un palindrome !"); //alors c'est un palindrome et on l'affiche
                        }  else { System.out.println(mot + " n'est pas un palindrome !"); } //sinon ce n'est pas un palindrome
                        break;

//Choix 2 : Compter le nom de lettre dans mot

                case 2:
                        Matcher matcher = Pattern.compile("[a-z]").matcher(phrase); //initialise la variable matcher qui recherche le pattern dans mot
                        int occur = 0; //variable pour compter le nombre de lettre
                        while(matcher.find()) {
                                occur++; //incrémentation de la variable qui compte les lettres si le matcher à trouvé des pattern
                        }
                        System.out.println("Il y a " + occur + " lettre(s) dans " + mot); //on affiche le nombre de lettre

                        break;

//Choix 3 : Remplacer un caractère par un autre

                case 3:
                sc.nextLine();
                System.out.println("Quelle caractère voulez vous remplacer : ");
                String lettre1 = sc.nextLine();
                System.out.println("Quelle caractère voulez vous mettre à la place de " + lettre1 + " : ");
                String lettre2 = sc.nextLine();
                        String mot2 = mot.replace(lettre1, lettre2); //initialise la variable mot2 en remplaçant les e par des a
                        System.out.println("Le mot devient : " + mot2); //on affiche mot2
                        break;

//Choix 4 : couper un mot

                case 4:
                        int millieu = mot.length() / 2; //on calcul la moitié du mot on met la valeur dans millieu
                        String[] parts = {mot.substring(0, millieu),mot.substring(millieu)}; //on initialise parts en [0] il y a la 1ere moitié du mot en [1] il y a la deuxième partie du mot
                        System.out.println(parts[0]); //on affiche 1ère moitié
                        System.out.println(parts[1]); //on affiche 2ème moitié

                        break;
//Choix 5 : changer le mot

                case 5:
                sc.nextLine();
                        System.out.println("Tapez le nouveau mot :");
                        mot = sc.nextLine(); //string mot contient la saisie utilisateur
                        mot = mot.toLowerCase(); //on transforme mot en minuscule
                        mot = mot.trim();  //on enlève les les séparateurs en début fin de ligne
                        phrase = mot.replaceAll("\\s", "");  //on stock dans la avriable phrase mot sans espaces
                        break;

//Choix 6 : quitter
                case 6:
                        System.out.println("Au revoir !");

                        break;
                }
        }
}
}

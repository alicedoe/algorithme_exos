import java.util.regex.Pattern; //import methode pattern
import java.util.regex.Matcher; //import methode matcher

public class exo5 {
    public static void main(String[] args) {
        String mot = "beweb"; //string mot utilisé chaque choix
        mot = mot.toLowerCase(); //on transforme mot en minuscule
        int choix = 2; // on choisit quel if executé
        
//Choix 1 : Palindrome, test si mot est un palindrome ou pas
        
        switch(choix) {
            
            case 1 :
        
            StringBuffer mot_palin = new StringBuffer(mot); //variable mot_palin = mot
            StringBuffer mot_palin2 = new StringBuffer(mot); //variable mot_palin2 = mot
            mot_palin.reverse(); // on inverse les lettres de mot_palin
            if (mot_palin.toString().equals(mot_palin2.toString())) { //si mot_palin est idem que mot_palin2
            System.out.println("C'est un palindrome !"); //alors c'est un palindrome et on l'affiche
            }  else { System.out.println("Ce n'est pas un palindrome !"); } //sinon ce n'est pas un palindrome
        break;

//Choix 2 : Compter le nom de lettre dans mot
        
       case 2 :
Matcher matcher = Pattern.compile("[a-z]").matcher(mot); //initialise la variable matcher qui recherche le pattern dans mot
    int occur = 0; //variable pour compter le nombre de lettre
    while(matcher.find()) {
        occur ++; //incrémentation de la variable qui compte les lettres si le matcher à trouvé des pattern
    }
    System.out.println(occur); //on affiche le nombre de lettre
            
        break;
        
//Choix 3 : Remplacer un caractère par un autre
        
       case 3 :
            String mot2 = mot.replace('e', 'a'); //initialise la variable mot2 en remplaçant les e par des a
            System.out.println(mot2); //on affiche mot2
        break;
        
//Choix 4 : couper un mot
        
        case 4 :
            int millieu = mot.length() / 2; //on calcul la moitié du mot on met la valeur dans millieu
            String[] parts = {mot.substring(0, millieu),mot.substring(millieu)}; //on initialise parts en [0] il y a la 1ere moitié du mot en [1] il y a la deuxième partie du mot
System.out.println(parts[0]); //on affiche 1ère moitié
System.out.println(parts[1]); //on affiche 2ème moitié
            
        break;
        }
    }
}
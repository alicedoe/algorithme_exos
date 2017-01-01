import java.util.regex.Pattern; //import methode pattern
import java.util.regex.Matcher; //import methode matcher

public class exo3 {
public static void main(String[] args) {

        String maChaine = "hello world";
        String monCarac = "o";

        Matcher matcher = Pattern.compile(monCarac).matcher(maChaine); //initialise la variable matcher qui recherche le pattern dans mot
            int occur = 0; //variable pour compter le nombre de lettre
            while(matcher.find()) {
                occur ++; //incrémentation de la variable qui compte les lettres si le matcher à trouvé des pattern
            }
            System.out.println(occur);


}
}

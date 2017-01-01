public class exo2 {
public static void main(String[] args) {
        int tableauEntier[] = new int[10]; // On créé un tableau d'entier de 10 cases

        for(int i = 0; i < tableauEntier.length-1; i++) // Boucle sur chaque case du tableau
        {
                tableauEntier[i] = (int)(Math.random( )*100) +1; //On remplit la case courante d'un nombre entier aléatoire compris entre 0 & 100
        }

        System.out.print("Tableau généré aléatoirement : ");

        for(int i = 0; i < tableauEntier.length-1; i++)
        {
                System.out.print ( tableauEntier[i] + " ");
        }

        System.out.println ();

        int echange;
        int trier = 0;

        while (trier == 0) {
            trier = 1;
            for(int i =0; i < tableauEntier.length-1; i++) {
                if (tableauEntier[i] > tableauEntier[i+1]) {
                    echange = tableauEntier[i];
                    tableauEntier[i] = tableauEntier[i+1];
                    tableauEntier[i+1] = echange;
                    trier = 0;
                }
            }
        }

        System.out.print("Tableau trié : ");

        for(int i = 1; i < tableauEntier.length; i++)
        {
                System.out.print ( tableauEntier[i] + " ");
        }

        System.out.println ();

}
}

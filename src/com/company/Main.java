package com.company;

public class Main {

    /**
     * Fonction principale de notre programme
     * @param args
     */
    public static void main(String[] args) {
        // On vérifie qu'il y a bien 2 arguments passés à notre programme
        if (args.length >= 2) {
            // On récupère et on convertit le premier argument
            int p = Integer.parseInt(args[0]);
            // On récupère et on convertit le second argument
            int q = Integer.parseInt(args[1]);

            // Déclaration des varialbes utiles plus tard.
            int pgcd, r;

            // Si P est égal à 0, le PGCD est Q
            if (p == 0)
                pgcd = q;

            // Si Q est égal à 0, le PGCD est P
            if (q == 0)
                pgcd = p;

            // Sinon tant que Q est différent de 0;
            while (q != 0) {
                // On calcule R le reste de la division entière de P par Q;
                r = p % q;
                // P reçoit la valeur de Q
                p = q;
                // Q reçoit la valeur du reste R
                q = r;
            }

            // A la fin de la boucle, le PGCD est contenu dans la variable P;
            pgcd = p;

            System.out.println("Le PGCD de " + args[0] + " et " + args[1] + " est : " + pgcd);
        } else {
            System.out.println("Veuillez passer au moins 2 arguments");
            System.exit(255);
        }
    }

}

package com.opckev;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Order {
    Scanner sc = new Scanner(System.in);
    String status = "";

    public String runProgram() {
        askName = "";
        int homepage = -1;
        int nextpage = -1;
        return askName + homepage + nextpage ;
        }


    public String  askName;

    {
        System.out.println("Bonjour et bienvenue sur le test des menus");
        System.out.println(" ");
        System.out.println("Avant d'aller plus loin, veuillez indiquer votre nom :");
        String nameGiven = "";
        boolean nameIsGood;
        do {
            try {
                nameGiven = sc.next();
                nameIsGood = true;
            } catch (InputMismatchException e) {
                sc.nextInt();
                System.out.println("Vous devez saisir un nom sans le moindre chiffre");
                nameIsGood = false;
            }
        } while (!nameIsGood);
        status = "Au revoir " + nameGiven;
        homepage();

        System.out.println(" ");
        System.out.println(String.format(status));
    }

    public int homepage() {
        System.out.println("Que souhaitez-vous faire ?" );
        System.out.println("1 - Lancer le programme");
        System.out.println("2 - Information");
        System.out.println("3 - Fermer le programme");
        int nbResponse ;
        nbResponse = sc.nextInt();
        if (nbResponse == 1) {
            nextpage ();
        }
        else if (nbResponse == 2) {
            System.out.println("Ici c'est le 2");
        }
        else if (nbResponse == 3) {
            System.out.println(" ");
        }
        else {
            System.out.println("Veuillez choisir l'une des propositions");
        }
        return 0;
    }

    public int nextpage() {
        System.out.println("Vous voila arriver sur le programme. Que souhaitez-vous faire maintenant ?" );
        System.out.println("1 - Revenir au menu précédent");
        System.out.println("2 - Fermer le programme");
        System.out.println("3 - Fermer le programme");
        int nbResponse ;
        nbResponse = sc.nextInt();
        if (nbResponse == 1) {
            homepage();
        }
        else if (nbResponse == 2) {
            System.out.println("Ici c'est le 2");
        }
        else if (nbResponse == 3) {
            System.out.println(" ");
        }
        else {
            System.out.println("Veuillez choisir l'une des propositions");
        }
        return 0;
    }
}
oopop

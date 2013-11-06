public class Joueur {

    private int score;
    private String nom;

    public Joueur(String nomJoueur) {
        nom = nomJoueur;
    }

    public String getNom() {
        return nom;
    }

    public void jouerUnTour(De[] des) {

        for (int i = 0; i < des.length; i++) {
            des[i].lancer();
        }

        if ((des[0].lireValeur() == 4)) {
            if ((des[1].lireValeur() == 2)) {
                if ((des[2].lireValeur() == 1)) {
                    score = score + 1;
                    System.out.println( getNom() + " a joué " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
//                } else {
//                    des[2].lancer();
//                    if ((des[2].lireValeur() == 1)) {
//                        score = score + 1;
//                        System.out.println( getNom() + " a relancé " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
//                    }
                }
            } if ((des[1].lireValeur() == 1)) {
                if ((des[2].lireValeur() == 2)) {
                    score = score + 1;
                    System.out.println( getNom() + " a joué " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
                }
            }
        } if (des[0].lireValeur() == 2) {
            if ((des[1].lireValeur() == 4)) {
                if ((des[2].lireValeur() == 1)) {
                    score = score + 1;
                    System.out.println( getNom() + " a joué " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
                }
            } if ((des[1].lireValeur() == 1)) {
                if ((des[2].lireValeur() == 4)) {
                    score = score + 1;
                    System.out.println( getNom() + " a joué " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
                }
            }
        } if ((des[0].lireValeur() == 1)) {
            if ((des[1].lireValeur() == 4)) {
                if ((des[2].lireValeur() == 2)) {
                    score = score + 1;
                    System.out.println( getNom() + " a joué " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
                }
            } if ((des[1].lireValeur() == 2)) {
                if ((des[2].lireValeur() == 4)) {
                    score = score + 1;
                    System.out.println( getNom() + " a joué " + des[0].lireValeur() + ", " + des[1].lireValeur() + " et " + des[2].lireValeur() + ", son score est : " + score + ".");
                }
            }
        }

    }

    public boolean asTuGagne() {
        return (score == 5);
    }

}

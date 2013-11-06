public class JeuDeDes {

    private Joueur j1;
    private Joueur j2;
    private Joueur j3;
    private Joueur j4;
    private Joueur j5;
    private Joueur j6;

    private De de1;
    private De de2;
    private De de3;

    public JeuDeDes() {
        j1 = new Joueur("Alberto");
        j2 = new Joueur("Brigitte");
        j3 = new Joueur("Caroline");
        j4 = new Joueur("Damien");
        j5 = new Joueur("Eve");
        j6 = new Joueur("Francis");

        de1 = new De();
        de2 = new De();
        de3 = new De();
    }


    public void jouerUnePartie() {

        De[] des = new De[3];
        des[0] = de1;
        des[1] = de2;
        des[2] = de3;


        do {

            j1.jouerUnTour(des);
            j2.jouerUnTour(des);
            j3.jouerUnTour(des);
            j4.jouerUnTour(des);
            j5.jouerUnTour(des);
            j6.jouerUnTour(des);

        } while (!j1.asTuGagne() && !j2.asTuGagne() && !j3.asTuGagne() && !j4.asTuGagne() && !j5.asTuGagne() && !j6.asTuGagne());

        if (j1.asTuGagne()) {
            System.out.println( j1.getNom() + " a gagné");
        }
        if (j2.asTuGagne()) {
            System.out.println( j2.getNom() + " a gagné");
        }
        if (j3.asTuGagne()) {
            System.out.println( j3.getNom() + " a gagné");
        }
        if (j4.asTuGagne()) {
            System.out.println( j4.getNom() + " a gagné");
        }
        if (j5.asTuGagne()) {
            System.out.println( j5.getNom() + " a gagné");
        }
        if (j6.asTuGagne()) {
            System.out.println( j6.getNom() + " a gagné");
        }

    }

}

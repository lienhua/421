public class De {

    private int valeurFace;
    private final int NOMBRE_MAXIMUM_DE_FACES = 6;

    public De() {
        valeurFace = 1;  // {1-6}
    }

    public int lireValeur() {
        return valeurFace;
    }

    public void lancer() {
        valeurFace = (int) (Math.random() * NOMBRE_MAXIMUM_DE_FACES) + 1;
    }

}

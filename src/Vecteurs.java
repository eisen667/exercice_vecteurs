public class Vecteurs {
    String[] mTableau;
    int nbElements;
    static final int RATIO_AGRANDISSEMENT = 1;
    static final int TAILLE_INITIALE = 4;

    public Vecteurs(){
        this.mTableau = new String[TAILLE_INITIALE];
        this.nbElements = mTableau.length - 1;
    }
}

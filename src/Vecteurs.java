public class Vecteurs {
    String[] mTableau;
    int nbElements;
    static final int RATIO_AGRANDISSEMENT = 1;
    static final int TAILLE_INITIALE = 4;

    public Vecteurs(){
        this.mTableau = new String[TAILLE_INITIALE];
        this.nbElements = mTableau.length - 1;
    }
    public void ajoute(String pElement){
        mTableau[mTableau.length - 1] = pElement;
    }
    public boolean ajoute(String pElement, int index){
        if (index >= mTableau.length) {
            return false;
        }
        else {
            mTableau[index] = pElement;
            return true;
        }
    }
    public String getElementAt(int index) {
        return mTableau[index];
    }
    public int getLength(){
        return this.mTableau.length;
    }
    public void ajoute(Vecteurs pCollection) {
        String[] newTableau = new String[pCollection.getLength() + this.mTableau.length];
        for (int i = 0 ; i < this.mTableau.length ; i++){
            newTableau[i] = this.mTableau[i];
        }
        for(int i = 0 ; i < pCollection.getLength(); i++){
            newTableau[mTableau.length + i] = pCollection.getElementAt(i);
        }
        this.mTableau = newTableau;
        }
    public void imprimer(){
        System.out.print("[ ");
        for(int i = 0; i < mTableau.length; i++) {
            System.out.printf("\"%s\"", mTableau[i]);
            if (i != mTableau.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println(" ]");
    }
}

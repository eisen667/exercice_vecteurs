public class Main {
    public static void main(String[] args) {
        Vecteurs monVecteur = new Vecteurs();
        monVecteur.ajoute("Allo",0);
        monVecteur.ajoute("Comment", 1);
        monVecteur.ajoute("Ca", 2);
        monVecteur.ajoute("Va", 3);
        Vecteurs monVecteur1 = new Vecteurs();
        monVecteur1.ajoute("Hey",0);
        monVecteur1.ajoute("Salur", 1);
        monVecteur1.ajoute("1", 2);
        monVecteur1.ajoute("2", 3);
        monVecteur.ajoute(monVecteur1);
        monVecteur.imprimer();
    }
}
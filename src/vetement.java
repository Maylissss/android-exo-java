public abstract class vetement {
    private String couleur;
    private int taille ;
    private int prix;
    private int qte;

    public vetement (String couleur, int taille, int prix, int qte){
        this.couleur = couleur; 
        this.taille = taille;
        this.prix = prix;
        this.qte = qte;
    }

    public abstract void coudre();

    public abstract void vendu();

    public int calcul() {

        return  prix * qte;

    }

}

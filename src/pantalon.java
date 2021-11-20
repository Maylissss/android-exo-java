public class pantalon extends vetement implements mixte{

    public pantalon(String couleur, int taille, int prix, int qte) {
        super(couleur, taille, prix, qte);
        
    }

    @Override
    public void coudre() {
        
        
    }

    @Override
    public void vendu() {
        
        
    }

    @Override
    public void porter() {
        System.out.println("Peut etre porter par n'importe qui.");
        
    }
    
}

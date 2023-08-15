package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario {
//  Se hicieron los cambios necesarios para manejar las diferentes marcas mediante una enumeración //

    private Marca marca;

    public enum Marca {
        GEF, POLO, NAUTICA
    }

    public Camisa(Marca pMarca, Talla pTalla, double pPrecio) {
        super(pTalla, pPrecio);
        marca = pMarca;
    }

    public String toString() {
        return "Camisa " + marca + " Talla " + talla + "($ " + precio + ")";
    }

}

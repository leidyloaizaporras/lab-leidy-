package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario{
		
	public static final String MARCA_GEF = "GEF";
	public static final String MARCA_POLO = "POLO";
	public static final String MARCA_NAUTICA = "NAUTICA";

	
	private String marca;
	
	public Camisa(String pMarca, Talla pTalla, double pPrecio)
	{
		super(pTalla, pPrecio);
		marca = pMarca;
	}
	
	public String toString()
	{
		return "Camisa "+marca + " Talla "+talla + "($ "+precio + ")";
	}

}

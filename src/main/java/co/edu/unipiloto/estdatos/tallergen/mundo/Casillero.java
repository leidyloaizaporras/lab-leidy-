package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Casillero {

	private Producto producto;

	public Casillero ()
	{
		producto = null;
	}

	public boolean agregar(Producto pProducto)
	{
		if(producto == null)
		{
			producto = pProducto;
			return true;
		}
		return false;
	}

	public Producto darProducto()
	{
		return producto;
	}

	public Producto despachar()
	{
		if(producto==null)
		{
			return producto;
		}
		
		Producto nObjeto = producto;
		producto = null;
		return nObjeto;
	}

	public boolean estaDesocupado() {
		
		if(producto==null)
		{
			return true;
		}
		return false;
		
	}
}

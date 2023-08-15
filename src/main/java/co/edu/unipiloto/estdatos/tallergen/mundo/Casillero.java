package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Casillero <T>{

	private T dato;

    public Casillero(T dato) {
        this.dato = dato;
    }
  
    Casillero() {
    }


    public boolean agregar(T t) {
        if (dato == null) {
            dato = (T) t;
            return true;
        }
        return false;
    }

    public Producto darProducto() {
        return (Producto) dato;
    }

    public Producto despachar() {
        if (dato == null) {
            return (Producto) dato;
        }

        T nObjeto = dato;
        dato = null;
        return (Producto) nObjeto;
    }

    public boolean estaDesocupado() {

        if (dato == null) {
            return true;
        }
        return false;

    }
 
    
}

//	private Producto producto;
//
//	public Casillero ()
//	{
//		producto = null;
//	}
//
//	public boolean agregar(Producto pProducto)
//	{
//		if(producto == null)
//		{
//			producto = pProducto;
//			return true;
//		}
//		return false;
//	}
//
//	public Producto darProducto()
//	{
//		return producto;
//	}
//
//	public Producto despachar()
//	{
//		if(producto==null)
//		{
//			return producto;
//		}
//		
//		Producto nObjeto = producto;
//		producto = null;
//		return nObjeto;
//	}
//
//	public boolean estaDesocupado() {
//		
//		if(producto==null)
//		{
//			return true;
//		}
//		return false;
//		
//	}
//}

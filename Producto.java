
/**
 * Registro de Produtos de Tienda
 * 
 * @author Dayanna Carrero
 * @version (a version number or a date)
 */
public class Producto
{
    private double precioProducto;
    private String nombreProducto;
    /**
     * Constructor for objects of class Producto
     */
    
    public Producto(String nombre, double precio)
    {
      precioProducto = precio;
      nombreProducto = nombre;
    }
    
    /**
     * Devuelve un double con el precio del producto.
     * 
     * @param No hay que introducir nada
     * @return Devuelve un double con el precio del producto.
     * 
     */
    public double getPrecio()
    {
        return precioProducto;
    }
    
     /**
     * Introduce Nombre Producto en tienda 
     */
    public String getNombre()
    {
        return nombreProducto;
    }
    /**
     * 
     */
    public void setPrecio(double nuevoPrecio)
   {
       precioProducto = nuevoPrecio;
    }
    
     public void setNombre(String nuevoNombre)
   {
       nombreProducto = nuevoNombre;
    }
}

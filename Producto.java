
/**
 * Registro de Prodcutos de Tienda
 * 
 * @author Dayanna
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
     * Introduce Producto en tienda 
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
}

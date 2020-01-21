
/**
 * Ejercicios de entorno de Desarrollo
 * 
 * Registro de Produtos de Tienda
 * 
 * @author Dayanna Carrero & Ander Muñoz
 * @version 21/01/2020
 */

public class Producto
{
    private double precioProducto;
    private String nombreProducto;
    
    /**
     * Constructor class Producto
     */
    
    public Producto(String nombre, double precio)
    {
      precioProducto = precio;
      nombreProducto = nombre;
    }
    
    /**
     * Devuelve un double con el precio del producto.
     * 
     * 
     * @return precioProducto
     * 
     */
    public double getPrecio()
    {
        return precioProducto;
    }
    /**
     * Devuelve un String con el nombre del producto.
     * 
     * 
     * @return nombreProducto.
     * 
     */
    public String getNombre()
    {
        return nombreProducto;
    }
    
    /**
     * Cambia el valor del precio del producto.
     * 
     * @param nuevoPrecio
     */
    public void setPrecio(double nuevoPrecio)
   {
       precioProducto = nuevoPrecio;
    }
    
    /**
     * Cambia el valor de la descripción del producto.
     * 
     * @param nuevoNombre
     */ 
    public void setNombre(String nuevoNombre)
   {
       nombreProducto = nuevoNombre;
    }
}

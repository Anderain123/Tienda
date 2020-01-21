
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
     * @param No hay que introducir nada
     * @return Devuelve un double con el precio del producto.
     * 
     */
    public double getPrecio()
    {
        return precioProducto;
    }
    /**
     * Devuelve un String con el nombre del producto.
     * 
     * @param No hay que introducir nada
     * @return Devuelve un String con el nombre del producto.
     * 
     */
    public String getNombre()
    {
        return nombreProducto;
    }
    
    /**
     * Cambia el valor del precio del producto
     */
    public void setPrecio(double nuevoPrecio)
   {
       precioProducto = nuevoPrecio;
    }
    
    /**
     * Cambia el valor de la descripción del producto
     */ 
    public void setNombre(String nuevoNombre)
   {
       nombreProducto = nuevoNombre;
    }
}

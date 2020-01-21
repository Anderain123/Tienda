
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
      this.precioProducto = precio;
      this.nombreProducto = nombre;
    }
    
    /**
     * Devuelve un double con el precio del producto.
     * 
     * @return precioProducto Devuelve un double con el precio del producto.
     * @param precioProducto no hay que introducir ningún valor
     */ 
    public void setNombre(String nuevoNombre)
   {
       nombreProducto = nuevoNombre;
    }
}

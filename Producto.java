
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
    public double getPrecio()
    {
        return precioProducto;
    }
    /**
     * Devuelve un String con el nombre del producto.
     * 
     * @return nombreProducto Devuelve un String con el nombre del producto.
     * @param nombreProducto no hay que introducir ningún valor
     */
    public String getNombre()
    {
        return nombreProducto;
    }
    
    /**
     * Cambia el valor del precio del producto
     * @param precioProducto almacena el precio nuevo del producto
     */
    public void setPrecio(double nuevoPrecio)
   {
       precioProducto = nuevoPrecio;
    }
    
    /**
     * Cambia el valor de la descripción del producto
     * @param nombreProducto almacena el nuevo nombre del producto
     */ 
    public void setNombre(String nuevoNombre)
   {
       nombreProducto = nuevoNombre;
    }
}

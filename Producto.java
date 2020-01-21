
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
<<<<<<< HEAD
     * @return precioProducto Devuelve un double con el precio del producto.
     * @param precioProducto no hay que introducir ningún valor
=======
     * @param No hay que introducir nada.
     * @return Devuelve un double con el precio del producto.
     * 
>>>>>>> 08520cfd1f27e6d77190ffe8313d0a441c5b8928
     */
    public double getPrecio()
    {
        return precioProducto;
    }
    /**
     * Devuelve un String con el nombre del producto.
     * 
<<<<<<< HEAD
     * @return nombreProducto Devuelve un String con el nombre del producto.
     * @param nombreProducto no hay que introducir ningún valor
=======
     * @param No hay que introducir nada.
     * @return Devuelve un String con el nombre del producto.
     * 
>>>>>>> 08520cfd1f27e6d77190ffe8313d0a441c5b8928
     */
    public String getNombre()
    {
        return nombreProducto;
    }
    
    /**
<<<<<<< HEAD
     * Cambia el valor del precio del producto
     * @param precioProducto almacena el precio nuevo del producto
=======
     * Cambia el valor del precio del producto.
     * 
     * @param El nuevo precio(double).
>>>>>>> 08520cfd1f27e6d77190ffe8313d0a441c5b8928
     */
    public void setPrecio(double nuevoPrecio)
   {
       precioProducto = nuevoPrecio;
    }
    
    /**
<<<<<<< HEAD
     * Cambia el valor de la descripción del producto
     * @param nombreProducto almacena el nuevo nombre del producto
=======
     * Cambia el valor de la descripción del producto.
     * 
     * @param El nuevo nombre(String).
>>>>>>> 08520cfd1f27e6d77190ffe8313d0a441c5b8928
     */ 
    public void setNombre(String nuevoNombre)
   {
       nombreProducto = nuevoNombre;
    }
}

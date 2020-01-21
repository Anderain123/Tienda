
/**
 * Ejercicios de entorno de Desarrollo
 * 
 * Línea de Produtos de Tienda
 *
 *Esta clase recoge un producto y la cantidad de el que hay.
 * 
 * @author (Dayanna Carrero & Ander Muñoz) 
 * @version (21/01/20)
 */
public class Linea
{
    private Producto producto;
    
    private int cantidad;

    /**
     * Constructor for objects of class Linea
     * 

     * @param producto Almacena el valor de descripción en línea
     * @param cantidad Almacena el valor de cantidad en línea

     */
    public Linea(int cuantos,Producto productito)
    {
        producto = productito;
        cantidad = cuantos;
    }
    /**
     * Devuelve la cantidad de productos que hay en la línea.
     * 

     * @param cantidad no hay que introducir nada
     * @return cantidad Devuelve un int con la cantidad.
     * 
     */
    public int getCantidad()
    {
        return cantidad;
    }
    
    /**
     * Cambia la cantidad con una nueva.
     * 
     * @param cantidad int que almacena la cantidad en la línea

     * @param nuevaCantidad
     * 
     */
    public void setCantidad(int nuevaCantidad)
    {
        cantidad = nuevaCantidad;
    }
    /**
     * Devuelve el producto que hay en la línea.
     * 

     * @param No hay que introducir nada
     * @return producto devuelve valor de producto

     */
    public void setProducto(Producto nuevoProducto)
    {
        producto = nuevoProducto;
    }
}

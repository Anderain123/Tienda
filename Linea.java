
/**
 * Esta clase recoge un producto y la cantidad de el que hay.
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
     * @param Hay que introducir un producto y la cantidad(int).
     * @return No devuelve nada.
     */
    public Linea(Producto productito, int cuantos)
    {
        producto = productito;
        cantidad = cuantos;
    }
    /**
     * Devuelve la cantidad de productos que hay en la línea.
     * 
     * @param No hay qie introducir nada
     * @return Devuelve un int con la cantidad.
     */
    public int getCantidad()
    {
        return cantidad;
    }
    /**
     * Cambia la cantidad de la linea por otra cantidad.
     * 
     * @param La nueva cantidad(int).
     * @return No devuelve nada.
     */
    public void setCantidad(int nuevaCantidad)
    {
        cantidad = nuevaCantidad;
    }
    /**
     * Devuelve el producto que hay en la línea.
     * 
     * @param No hay que introducir nada
     * @return Devuelve el producto.
     */
    public Producto getProducto()
    {
        return producto;
    }
    /**
     * Cambia el producto de la linea por otro producto.
     * 
     * @param El nuevo producto.
     * @return No devuelve nada.
     */
    public void setProducto(Producto nuevoProducto)
    {
        producto = nuevoProducto;
    }
}

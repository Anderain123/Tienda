
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
     * @param cuantos 
     * @param productito
     */
    public Linea(int cuantos,Producto productito)
    {
        producto = productito;
        cantidad = cuantos;
    }
    /**
     * Devuelve la cantidad de productos que hay en la línea.
     * 
     * 
     * @return cantidad.
     */
    public int getCantidad()
    {
        return cantidad;
    }
    /**
     * Cambia la cantidad de la linea por otra cantidad.
     * 
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
     * 
     * @return producto
     */
    public Producto getProducto()
    {
        return producto;
    }
    /**
     * Cambia el producto de la linea por otro producto.
     * 
     * @param nuevoProducto.
     * 
     */
    public void setProducto(Producto nuevoProducto)
    {
        producto = nuevoProducto;
    }
}

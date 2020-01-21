
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
<<<<<<< HEAD
     * @param producto Almacena el valor de descripción en línea
     * @param cantidad Almacena el valor de cantidad en línea
=======
     * @param cuantos 
     * @param productito
>>>>>>> a80dc211c793eb50ee3cd57074fb7bc5d8b3cba4
     */
    public Linea(int cuantos,Producto productito)
    {
        producto = productito;
        cantidad = cuantos;
    }
    /**
     * Devuelve la cantidad de productos que hay en la línea.
     * 
<<<<<<< HEAD
     * @param cantidad no hay que introducir nada
     * @return cantidad Devuelve un int con la cantidad.
=======
     * 
     * @return cantidad.
>>>>>>> a80dc211c793eb50ee3cd57074fb7bc5d8b3cba4
     */
    public int getCantidad()
    {
        return cantidad;
    }
    /**
     * Cambia la cantidad de la linea por otra cantidad.
     * 
<<<<<<< HEAD
     * @param cantidad int que almacena la cantidad en la línea
=======
     * @param nuevaCantidad
     * 
>>>>>>> a80dc211c793eb50ee3cd57074fb7bc5d8b3cba4
     */
    public void setCantidad(int nuevaCantidad)
    {
        cantidad = nuevaCantidad;
    }
    /**
     * Devuelve el producto que hay en la línea.
     * 
<<<<<<< HEAD
     * @param No hay que introducir nada
     * @return producto devuelve valor de producto
=======
     * 
     * @return producto
>>>>>>> a80dc211c793eb50ee3cd57074fb7bc5d8b3cba4
     */
    public Producto getProducto()
    {
        return producto;
    }
    /**
     * Cambia el producto de la linea por otro producto.
     * 
<<<<<<< HEAD
     * @param producto almacena nuevo valor de prodcuto en línea
     * @see Producto
=======
     * @param nuevoProducto.
     * 
>>>>>>> a80dc211c793eb50ee3cd57074fb7bc5d8b3cba4
     */
    public void setProducto(Producto nuevoProducto)
    {
        producto = nuevoProducto;
    }
}

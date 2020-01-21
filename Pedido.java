import java.util.HashMap;
/**
 * Ejercicios de entorno de Desarrollo
 * 
 * Pedido de Produtos de Tienda
 * 
 * @author (Dayanna Carrero & Ander Muñoz) 
 * @version (21/01/20)
 */
public class Pedido
{
    private HashMap<Integer, Linea> lineas;
    private String direccionEnvio;
    private String nombreCliente;
    private int carmelo;
   
    /**
     * Constructor class Pedido.

     */
    public Pedido(String direccion, String nombre)
    {
       lineas = new HashMap();
       direccionEnvio = direccion;
       nombreCliente = nombre;
       carmelo = 1;
    }
    
    /**
     * 
     * @return direcciónEnvio string con la dirección del envío
     * 
     */
    public String getDireccion()
    {
        return direccionEnvio;
    }
    
    /**
     * 
     * @return nombreCliente string con el nombre del cliente
     * 
     */
    public String getNombreCliente()
    {
        return nombreCliente;
    }
    
}

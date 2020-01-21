import java.util.HashMap;
/**
 * Write a description of class Pedido here.
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
     * Constructor for objects of class Pedido.
     * 
     * @param Una direccion(String) y un nombre(String).
     */
    public Pedido(String direccion, String nombre)
    {
       lineas = new HashMap();
       direccionEnvio = direccion;
       nombreCliente = nombre;
       carmelo = 1;
    }
    
    public String getDireccion()
    {
        return direccionEnvio;
    }
    
    public String getNombreCliente()
    {
        return nombreCliente;
    }
    
}

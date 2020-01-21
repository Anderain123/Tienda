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
    /**
     * Devuelve la direccion de envio.
     * 
     * @param No hay que introducir nada.
     * @return devuelve una String con la direccion de envio.
     */
    public String getDireccion()
    {
        return direccionEnvio;
    }
    /**
     * Devuelve el nombre del cliente.
     * 
     * @param No hay que introducir nada
     * @return Devuelve una String con el nombre del cliente.
     */
    public String getNombreCliente()
    {
        return nombreCliente;
    }
    /**
     * Cambia la direccion de envia por una nueva.
     * 
     * @param La nueva direccion de envio(String).
     * @return No devuelve nada.
     */
    public void setDireccion(String nuevaDireccion)
    {
        direccionEnvio = nuevaDireccion;
    }
    /**
     * Cambia el nombre del cliente por uno nuevo.
     * 
     * @param El nuevo nombre del cliente(String).
     * @return No devuelve nada.
     */
    public void setNombreCliente(String nuevoNombreCliente)
    {
        nombreCliente = nuevoNombreCliente;
    }
}

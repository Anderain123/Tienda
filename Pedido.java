import java.util.HashMap;
import java.util.Scanner;
/**
 * Recoge las lineas la direccion y el nombre del cliente al que tiene que ir el pedido.
 * 
 * @author (Dayanna Carrero & Ander Muñoz) 
 * @version (21/01/20)
 */
public class Pedido
{
    
    private String direccionEnvio;
    private String nombreCliente;
    private HashMap<Integer, Linea> lineas;
    private int carmelo;
    private Scanner sc;
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
       sc = new Scanner(System.in);
    }
    
    /**
     * Devuelve la direccion de envio.
     * 
     * 
     * @return direccionEnvio devuelve una String con la direccion de envio.
     */
    public String getDireccion()
    {
        return direccionEnvio;
    }
    /**
     * Devuelve el nombre del cliente.
     * 
     * 
     * @return nombreCliente Devuelve una String con el nombre del cliente.
     */
    public String getNombreCliente()
    {
        return nombreCliente;
    }
    /**
     * Cambia la direccion de envia por una nueva.
     * 
     * @param nuevaDireccion La nueva direccion de envio(String).
     * a
     */
    public void setDireccion(String nuevaDireccion)
    {
        direccionEnvio = nuevaDireccion;
    }
    /**
     * Cambia el nombre del cliente por uno nuevo.
     * 
     * @param nuevoNombreCliente El nuevo nombre del cliente(String).
     * 
     */
    public void setNombreCliente(String nuevoNombreCliente)
    {
        nombreCliente = nuevoNombreCliente;
    }
    /**
     * Pide el nombre, el precio y la cantidad del producto a enviar, luego crea 
     * el preoducto, la linea y la mete en orden en el pedido.
     * 
     * @see Producto
     * @see Linea
     */
    public void añadirLinea()
    {
        System.out.println("Dime el nombre del producto");
        String prod = sc.next();
        System.out.println("Dime el precio del producto");
        double prec = sc.nextDouble();
        System.out.println("Dime la cantidad de productos que hay");
        int cant = sc.nextInt();
        Producto produ = new Producto(prod,prec);
        Linea linea = new Linea(cant, produ);
        lineas.put(carmelo, linea);
        carmelo++;
    }
}


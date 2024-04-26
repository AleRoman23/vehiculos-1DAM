
package vehiculo;
/**
 * @author aleja
 * @version 1.0
 * @since 26-04-2024
 */
public class VehiculoARG2324 {

    /**
     * atributo que indica el nombre del vehiculo
     */
    protected String nombre;
     /**
     * atributo que indica el nombre del vehiculo
     */
    protected double precio;
     /**
     * atributo que indica el nombre del vehiculo
     */
    protected double precioIVA;
     /**
     * atributo que indica el nombre del vehiculo
     */
    protected int stock;
    /**
    /* Constructor sin argumentos 
    */
     /**
     * Constructor sin atributos de la clase
     */
    
    public VehiculoARG2324 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     * Constructor con parámetros
     * @param nom nombre del vehículo
     * @param precio precio de venta del vehículo
     * @param stock número de unidades en stock
     */
    
    public VehiculoARG2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
    /**
     *  Método para asignar el nombre del vehiculo
     * @param nom asignar nombre
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que me devuelve el nombre del vehiculo
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
     
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }
    /* Método para comprar vehiculos.
    
    /**
     * Método para comprar vehiculos.
     * @param cantidad
     * @throws Exception 
       */

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }
    /**
     * Método de selección del atributo nombre
     * @return 
     */

    public String getNombre() {
        return nombre;
    }
/**
 * Método de acceso del atributo del nombre
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioIVA() {
        return precioIVA;
    }

    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    


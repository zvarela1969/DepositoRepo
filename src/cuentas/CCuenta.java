package cuentas;
/**
 * 
 * @author Zeus
 * En la Clase CCuenta he encapsulado todos los atributos para 
 * que solo se puedan manipular con los metodos geter y seter.
 * <p>
 * a traves de esta clase se podra ver y actualizar estos atributos
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Atributo nombre con modificador privado para evitar su manipulacion
     * directa a traves de su atributo
     */
    private String nombre;
    /**
     * Atributo cuenta privado
     */
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**
     * Declaramos el constructor vacio por defecto
     */
    public CCuenta()
    {
    }
    /**
     * Declaramos el costructor con todos sus parametros
     * @param nom Recibe el valor desde cuando instanciamos un objeto de la clase Ccuenta
     * @param cue
     * @param sal
     * @param tipo 
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Este metodo me devuelve el saldo de la cuenta
     * @return 
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * En este metodo se utiliza la cantidad recibida en la llamada para ingresarla
     * @param cantidad a Ingresar en la cuenta
     * @throws Exception  Error, si queremos ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * M4etodo que saca de la cuenta una cantidad indicada en la llamada al metodo
     * @param cantidad retirada
     * @throws Exception Error si queremos sacar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
}

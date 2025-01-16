package ud03;

public class Centro {
    Integer codigo;
    String nombre;
    String localidad;
    String calle;
    String numero;
    Integer codigoPostal;
    //consturctores
    public Centro(Integer codigo, String nombre, String localidad, String calle, String numero, Integer codigoPostal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.localidad = localidad;
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }

    //getters setters
    public Integer getCodigo() {
        return codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Integer getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    //toString
    @Override
    public String toString() {
        return "Centro [codigo=" + codigo + ", nombre=" + nombre + ", localidad=" + localidad + ", calle=" + calle
                + ", numero=" + numero + ", codigoPostal=" + codigoPostal + "]";
    }
    //Concatenar direccion
    public String getDireccion() {
        return localidad + " " +
                calle + " " +
                numero + " " +
                codigoPostal;
    }
   


    
    

    
    

}

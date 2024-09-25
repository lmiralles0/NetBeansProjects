package Objetos;


/**
 *
 * @author Luciano Miralles
 */
public class Domicilio {
    private String calle;
    private int numero;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    
    public Domicilio()
    {
        
    }
    
    public Domicilio(String calle, int numero, String ciudad, String provincia, String codigoPostal) {
        setCalle(calle);
        setNumero(numero);
        setCiudad(ciudad);
        setProvincia(provincia);
        setCodigoPostal(codigoPostal);
    }

    public String getCalle() {
        return calle;
    }

    private void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    private void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    private void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    private void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    @Override
    public String toString()
    {
        return "";
    }
    

}

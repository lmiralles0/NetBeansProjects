
/**
 *
 * @author Luciano Miralles
 */
public class Domicilio {
    private String calle;
    private int numero;
    private int piso;
    private String departamento;

    public Domicilio(String calle, int numero, int piso, String departamento) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
    }
// getters
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public int getPiso() {
        return piso;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    // setters

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void mostrarDomicilio(){
        System.out.println("Domicilio: " + calle + " " + numero + " Piso: " + piso + " " + "Departamento: " + departamento);
    }
}

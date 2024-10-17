

package modelo;

/**
 *
 * @author Luciano Miralles
 */
public abstract class Publicacion {

    protected float _importe;
    protected String _nombre;
    protected int _stock;

    
    
    
    public abstract boolean esColor();

    public boolean hayStock()
    {
        return getStock() > 0 && getImporte() > 0;
    }
    
    
    public float getImporte() {
        return _importe;
    }


    public int getStock() {
        return _stock;
    }

    public void setStock(int stock) {
        if(stock > 0)
        {
            this._stock = stock;
        }
    }


    public String obtenerInformacion()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(publicacion(_nombre, getStock(), getImporte()));
        return sb.toString();
    }        
    
    public String publicacion(String nombre)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ") .append(_nombre) .append("\n");
        return sb.toString();
    }
    
    public String publicacion(String nombre, int stock)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(publicacion(nombre));
        sb.append("Stock: ") .append(getStock()) .append("\n");
        return sb.toString();
    }
    
    public String publicacion(String nombre, int stock, float importe)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(publicacion(nombre, stock));
        sb.append("Es color: ") .append((esColor()) ? "SI" : "NO") .append("\n");
        sb.append("Importe: $") .append(getImporte()) .append("\n");
        sb.append("--------------------------------------------------");
        return sb.toString();
    }
            
    @Override
    public String toString()
    {
        return _nombre.toString();
    }
}

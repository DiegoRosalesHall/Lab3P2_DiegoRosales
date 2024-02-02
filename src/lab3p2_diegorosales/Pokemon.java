package lab3p2_diegorosales;

public class Pokemon {
   protected String nombre;
   protected int entrada;
   protected String naturaleza;
   protected boolean captura;

    public Pokemon(String nombre, int entrada, String naturaleza, boolean captura) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.naturaleza = naturaleza;
        this.captura = captura;
        
    }

    public Pokemon() {
    }
    
    

   
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isCaptura() {
        return captura;
    }

    public void setCaptura(boolean captura) {
        this.captura = captura;
    }
   
   
   
}

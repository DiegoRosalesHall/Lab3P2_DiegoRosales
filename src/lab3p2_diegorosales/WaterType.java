
package lab3p2_diegorosales;


public class WaterType extends Pokemon {
    private boolean vivirFueraAgua;
    private int velocidadNadar;

    public WaterType(boolean vivirFueraAgua, int velocidadNadar, String nombre, int entrada, String naturaleza, boolean captura) {
        super(nombre, entrada, naturaleza, captura);
        this.vivirFueraAgua = vivirFueraAgua;
        this.velocidadNadar = velocidadNadar;
    }

    
    
    public boolean isVivirFueraAgua() {
        return vivirFueraAgua;
    }

    public void setVivirFueraAgua(boolean vivirFueraAgua) {
        this.vivirFueraAgua = vivirFueraAgua;
    }

    public int getVelocidadNadar() {
        return velocidadNadar;
    }

    public void setVelocidadNadar(int velocidadNadar) {
        this.velocidadNadar = velocidadNadar;
    }
    
    
}

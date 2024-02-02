
package lab3p2_diegorosales;


public class GrassType extends Pokemon{
    private String habitat;
    private int  controlPlantas;

    public GrassType(String habitat, int controlPlantas, String nombre, int entrada, String naturaleza, boolean captura) {
        super(nombre, entrada, naturaleza, captura);
        this.habitat = habitat;
        this.controlPlantas = controlPlantas;
    }

    @Override
    public String toString() {
        return super.toString()+"GrassType{" + "habitat=" + habitat + ", controlPlantas=" + controlPlantas + '}';
    }

    
    
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getControlPlantas() {
        return controlPlantas;
    }

    public void setControlPlantas(int controlPlantas) {
        this.controlPlantas = controlPlantas;
    }
    
    
}


package lab3p2_diegorosales;

public class FireType extends Pokemon{
    private int potenciaLlamas;

    public FireType(int potenciaLlamas, String nombre, int entrada, String naturaleza, boolean captura) {
        super(nombre, entrada, naturaleza, captura);
        this.potenciaLlamas = potenciaLlamas;
    }

    @Override
    public String toString() {
        return super.toString()+"FireType{" + "potenciaLlamas=" + potenciaLlamas + '}';
    }
    
    

    public int getPotenciaLlamas() {
        return potenciaLlamas;
    }

    public void setPotenciaLlamas(int potenciaLlamas) {
        this.potenciaLlamas = potenciaLlamas;
    }
    
    
}

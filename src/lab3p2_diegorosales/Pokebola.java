
package lab3p2_diegorosales;


public class Pokebola {
    String color;
    int eficiencia;

    public Pokebola(String color, int eficiencia) {
        this.color = color;
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokebola{" + "color=" + color + ", eficiencia=" + eficiencia + '}';
    }

    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    
}

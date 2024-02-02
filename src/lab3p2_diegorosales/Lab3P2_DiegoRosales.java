
package lab3p2_diegorosales;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab3P2_DiegoRosales {
    public static Scanner mcgregor = new Scanner(System.in);
    public static Scanner mcgregorstring = new Scanner(System.in);
    public static void main(String[] args) {
        int a=1;
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        while(a==1){
            System.out.println("Bienvenido al menu!");
            System.out.println("1. Crear Pokemon");
            System.out.println("2. Crear Pokebola");
            System.out.println("3. Listar Pokemon");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon");
            System.out.println("6. Modificar Pokemon");
            System.out.println("7. Evolucionar Pokemon??");
            System.out.println("8. Finalizar el programa :( ");
            int opcionMenu1= mcgregor.nextInt();
            if(opcionMenu1==1){
                
                System.out.println("Inserta el nombre del Pokemon! :");
                String nombre = mcgregorstring.nextLine();
                System.out.println("Ingresa su numero de enterada a la PokedEx");
                int nEntrada = mcgregor.nextInt();
                System.out.println("Ingresa su naturaleza! (Timido/Energetico/Misterioso) :");
                String naturaleza = mcgregor.nextLine();
               
                int opcionTipo=1;
                String tipo = "";
                while (opcionTipo==1){
                System.out.println("Inserta el tipo de pokemon: ");
                System.out.println("1. Fire-Type");
                System.out.println("2. Water-Type");
                System.out.println("3. Grass-Type");
                int seleccionTipo = mcgregor.nextInt();
                if(seleccionTipo==1){
                    System.out.println("Ingrese la potencia del fuego en escala de enteros del 1-100");
                    int potencia = mcgregor.nextInt();
                    listaPokemon.add(new FireType(potencia,nombre,nEntrada,naturaleza,false));
                    opcionTipo=0;
                            
                }// TIPO FUEGO
                
                else if(seleccionTipo==2){
                   
                    int b=1;
                    boolean vidaFueraAgua = false;
                    while(b==1){
                    System.out.println("El pokemon puede vivir fuera del agua? S/N");
                    String seleccion = mcgregorstring.nextLine();
                    if(seleccion.equals("s") || seleccion.equals("S")){
                        b=0;
                        vidaFueraAgua = true;
                    }
                    else if(seleccion.equals("n") || seleccion.equals("N")){
                        b=0;
                        vidaFueraAgua=false;
                    }
                    else{
                        System.out.println("Error, seleccion invalida vuelva a intentarlo");
                    }
                    
                    }
                    opcionTipo=0;
                    System.out.println("Ingrese su rapidez al nadar: ");
                    int velocidad = mcgregor.nextInt();
                    
                    listaPokemon.add(new WaterType(vidaFueraAgua,velocidad,nombre,nEntrada,naturaleza, false));
                }
                else if(seleccionTipo==3){
                    System.out.println("Ingrese su control sobre las plantas con un entero del 1-100: ");
                    int control = mcgregor.nextInt();
                    System.out.println("Ingrese el habitat del pokemon:  ");
                    String habitat = mcgregorstring.nextLine();
                    listaPokemon.add(new GrassType(habitat,control,nombre,nEntrada,naturaleza,false));
                    opcionTipo=0;
                }
                else{
                    System.out.println("Error, seleccion invalida");
                }
                
                }
                
            }// CREAR POKEMON
            else if(opcionMenu1==2){
                System.out.println("Ingrese el color de la Pokebola");
                String color = mcgregorstring.nextLine();
                System.out.println("Ingrese su eficiencia en escala de 1-3");
                int eficiencia = mcgregor.nextInt();
                
            }// CREAR POKEBOLA
            
        }// Fin del menu
        
        
        
        
    }// Fin del main
    
}//Fin de la clas

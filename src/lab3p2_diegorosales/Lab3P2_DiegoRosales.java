
package lab3p2_diegorosales;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Lab3P2_DiegoRosales {
    public static Scanner mcgregor = new Scanner(System.in);
    public static Scanner mcgregorstring = new Scanner(System.in);
    public static void main(String[] args) {
        
        int a=1;
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        ArrayList<Pokebola> listaPokebolas = new ArrayList<>();
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
                String naturaleza = mcgregorstring.nextLine();
               
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
                int b=1;
                int eficiencia =0;
                while(b==1){
                    
                
                System.out.println("Ingrese su eficiencia en escala de 1-3");
                eficiencia = mcgregor.nextInt();
                if(eficiencia>=1 && eficiencia <=3){
                    b=0;
                }
                else{
                    System.out.println("ERROR, la eficiencia elegida ha salido de los parametros");
                }
                  
            }
                listaPokebolas.add(new Pokebola(color,eficiencia));
            }// CREAR POKEBOLA   
            else if(opcionMenu1==3){
                if(listaPokemon.isEmpty()){
                    System.out.println("No hay Pokemon que listar!");
                }
                else{
                System.out.println("Lista de pokemons: ");
                System.out.println("Fire types: ");
                for (int i = 0; i < listaPokemon.size(); i++) {
                    if (listaPokemon.get(i)instanceof FireType){
                        System.out.println((i+1)+". "+listaPokemon.get(i));
                    }
                    else{
                        
                    }
                    
                }
                System.out.println("");
                System.out.println("Water types: ");
                for (int i = 0; i < listaPokemon.size(); i++) {
                     if (listaPokemon.get(i)instanceof WaterType){
                        System.out.println((i+1)+". "+listaPokemon.get(i));
                    }
                     else{
                     }
                    
                }
                System.out.println("");
                System.out.println("Grass types: ");
                for (int i = 0; i < listaPokemon.size(); i++) {
                     if (listaPokemon.get(i)instanceof GrassType){
                        System.out.println((i+1)+". "+listaPokemon.get(i));
                        
                    }
                     else{
                         
                     }
                    
                }
                System.out.println("");
                }
            } // LISTAR POKEMONS
            
            else if (opcionMenu1 == 4) {
                if(listaPokemon.isEmpty()){
                    System.out.println("No hay Pokemon que eliminar!");
                }
                else{
                int b = 1;
                while (b == 1) {
                    System.out.println("Selecciona el tipo de Pokemon que deseas eliminar: ");
                    System.out.println("1. Fire Type");
                    System.out.println("2. Water Type");
                    System.out.println("3. Grass Type");

                    int tipoPokemon = mcgregor.nextInt();
                    if (tipoPokemon < 1 || tipoPokemon > 3) {

                        System.out.println("Error, has seleccionado una opcion invalida, porfavor vuelve a intentarlo");

                    } else if (tipoPokemon == 1) {
                        int c = 1;
                        while (c == 1) {
                            ArrayList<Integer> index = new ArrayList<>();
                            System.out.println("Fire types: ");
                            for (int i = 0; i < listaPokemon.size(); i++) {
                                if (listaPokemon.get(i) instanceof FireType) {
                                    System.out.println((i + 1) + ". " + listaPokemon.get(i).getNombre());
                                    index.add(i);
                                } else {

                                }

                            }

                            int eleccionPokemon = mcgregor.nextInt();
                            if (eleccionPokemon > index.size() || eleccionPokemon < 1) {
                                System.out.println("Error has elegido un numero fuera de rango, porfavor vuelve a intentarlo");
                            } else {
                                for (int i = 0; i < listaPokemon.size(); i++) {
                                    if (index.get(eleccionPokemon - 1) == i) {
                                        listaPokemon.remove(i);
                                    } else {

                                    }

                                }

                                b = 0;
                                c = 0;

                            }
                        }
                    } else if (tipoPokemon == 2) {
                        int c = 1;
                        while (c == 1) {

                            ArrayList<Integer> index = new ArrayList<>();
                            System.out.println("Water types: ");
                            for (int i = 0; i < listaPokemon.size(); i++) {
                                if (listaPokemon.get(i) instanceof WaterType) {
                                    System.out.println((i + 1) + ". " + listaPokemon.get(i).getNombre());
                                    index.add(i);
                                } else {
                                }

                            }

                            int eleccionPokemon = mcgregor.nextInt();
                            if (eleccionPokemon > index.size() || eleccionPokemon < 1) {
                                System.out.println("Error, ha elegido un numero fuera de rango, porfavor vuelva a intentarlo");
                            } else {
                                for (int i = 0; i < listaPokemon.size(); i++) {
                                    if (index.get(eleccionPokemon - 1) == i) {
                                        listaPokemon.remove(i);
                                    } else {

                                    }

                                }

                                b = 0;
                                c=0;
                                
                            }
                        }
                    } else if (tipoPokemon == 3) {
                        int c = 1;
                        while (c == 1) {
                            ArrayList<Integer> index = new ArrayList<>();
                            System.out.println("Grass types: ");
                            for (int i = 0; i < listaPokemon.size(); i++) {
                                if (listaPokemon.get(i) instanceof GrassType) {
                                    System.out.println((i + 1) + ". " + listaPokemon.get(i).getNombre());
                                    index.add(i);

                                } else {

                                }

                            }

                            int eleccionPokemon = mcgregor.nextInt();
                            if (eleccionPokemon > index.size() || eleccionPokemon < 1) {
                                System.out.println("Error, ha elegido un numero fuera de rango, porfavor vuelva a intentarlo");
                            } else {
                                for (int i = 0; i < listaPokemon.size(); i++) {
                                    if (index.get(eleccionPokemon - 1) == i) {
                                        listaPokemon.remove(i);
                                    } else {

                                    }

                                }

                                b = 0;
                                c = 0;
                            }

                        }
                    }

                }
                }
            } // ELIMINAR POKEMON
            
            else if(opcionMenu1==5){
                
                if(listaPokebolas.isEmpty()){
                    System.out.println("No hay Pokebolas para Capturar :( ");
                }
                else if(listaPokemon.isEmpty()){
                    System.out.println("No hay Pokemon que atrapar! :( ");
                }
                else{
                    int d=1;
                    int eleccionPokebola=0;
                    while(d==1){
                    
                System.out.println("Eliga su Pokebola!: ");
                for (int i = 0; i < listaPokebolas.size(); i++) {
                    System.out.println((i+1)+". Eficiencia: "+listaPokebolas.get(i).getEficiencia()+"  Color: "+listaPokebolas.get(i).getColor());
                }
                    eleccionPokebola=0;
                    eleccionPokebola+= mcgregor.nextInt();
                    
                    if(eleccionPokebola>listaPokebolas.size() || eleccionPokebola<1){
                        System.out.println("Has intentado elegir una pokebola no existente! Vuelve a intentarlo");
                    }
                    else{
                        d=0;
                    }
                    
                
                }
                    Random rand = new Random();
                    int f=1;
                    int nrand=1;
                    while(f==1){
                    nrand = rand.nextInt(0,listaPokemon.size());
                    if(listaPokemon.get(nrand).isCaptura() == false ){
                        f=0;
                    }
                    else{
                        
                    }
                        
                    }
                int c=1;
                        while(c==1){
                    System.out.println("UN "+listaPokemon.get(nrand).getNombre()+" HA APARECIDO!");
                    System.out.println("Que deseas hacer? ");
                    System.out.println("1. Intentar Capturar");
                    System.out.println("2. Huir ");
                    int eleccion = mcgregor.nextInt();
                    if(eleccion==1){
                        if(listaPokebolas.get(eleccionPokebola-1).getEficiencia()==1){
                            int probAtrapar = 1;
                            int probabilidad = rand.nextInt(1,4);
                            
                            if(probAtrapar==probabilidad){
                               for (int i = 0; i < 4; i++) {
                                System.out.println("La pokebola tiembla... ");
                            }
                               System.out.println("Has atrapado a "+listaPokemon.get(nrand).getNombre()+"!");
                                System.out.println(listaPokemon.get(nrand).getNombre()+" ha sido añadido a tu equipo");
                                c=0;
                                listaPokemon.get(nrand).setPokebal(listaPokebolas.get(eleccionPokebola-1));
                                listaPokebolas.remove(eleccionPokebola-1);
                                listaPokemon.get(nrand).setCaptura(true);
                            }
                            else{
                                for (int i = 0; i < probabilidad; i++) {
                                    System.out.println("La pokebola tiembla... ");
                                    
                                }
                                
                                System.out.println("Rayos y centellas, "+listaPokemon.get(nrand).getNombre() +" ha roto la pokebola!");
                                System.out.println(listaPokemon.get(nrand).getNombre()+" ha escapado ");
                                c=0;
                                listaPokebolas.remove(eleccionPokebola-1);
                            }
                        }
                        else if(listaPokebolas.get(eleccionPokebola-1).getEficiencia()==2){
                            int probAtrapar = 2;
                            int probabilidad = rand.nextInt(1,4);
                            if(probAtrapar<=probabilidad){
                               for (int i = 0; i < 4; i++) {
                                System.out.println("La pokebola tiembla... ");
                            }
                               System.out.println("Has atrapado a "+listaPokemon.get(nrand).getNombre()+"!");
                                System.out.println(listaPokemon.get(nrand).getNombre()+" ha sido añadido a tu equipo");
                                c=0;
                                listaPokemon.get(nrand).setPokebal(listaPokebolas.get(eleccionPokebola-1));
                                listaPokebolas.remove(eleccionPokebola-1);
                                listaPokemon.get(nrand).setCaptura(true);
                            }
                            else{
                                for (int i = 0; i < probabilidad; i++) {
                                    System.out.println("La pokebola tiembla... ");
                                    
                                }
                                
                                System.out.println("Rayos y centellas, "+listaPokemon.get(nrand).getNombre() +" ha roto la pokebola!");
                                System.out.println(listaPokemon.get(nrand).getNombre()+" ha escapado ");
                                c=0;
                                listaPokebolas.remove(eleccionPokebola-1);
                            }
                        }
                        else if(listaPokebolas.get(eleccionPokebola-1).getEficiencia()==3){
                            for (int i = 0; i < 4; i++) {
                                System.out.println("La pokebola tiembla... ");
                            }
                            System.out.println("Has atrapado a "+listaPokemon.get(nrand).getNombre()+"!");
                            System.out.println(listaPokemon.get(nrand).getNombre()+" ha sido añadido a tu equipo");
                            listaPokemon.get(nrand).setPokebal(listaPokebolas.get(eleccionPokebola-1));
                                listaPokebolas.remove(eleccionPokebola-1);
                                listaPokemon.get(nrand).setCaptura(true);
                                c=0;
                        }
                        
                        
                    }
                    else if(eleccion == 2 ){
                        System.out.println("Has huido con exito!");
                        c=0;
                    }
                    
                    else{
                        System.out.println("Elegiste una opcion invalida! porfavor vuelve a intentarlo");
                    }
                        }
                
                }
            } // CAPTURAR
            else if(opcionMenu1==6){
                int b=1;
                while(b==1){
                    int cont =0;
                      for (int i = 0; i < listaPokemon.size(); i++) {
                            if (listaPokemon.get(i) instanceof FireType && listaPokemon.get(i).isCaptura() == true){
                                cont ++;
                            }
                            else{
                                
                            }
                        }
                        if(cont==0){
                            System.out.println("No hay pokemons atrapados para modificar! ");
                            b=0;
                        }
                        else{
                System.out.println("Seleccione el tipo de Pokemon que desea modificar: ");
                System.out.println("1. Fire Type");
                System.out.println("2. Water Type");
                System.out.println("3. Grass Type");
                int eleccionTipo = mcgregor.nextInt();
                if(eleccionTipo==1){
                    int c=1;
                    
                    while(c==1){
                    System.out.println("Selecciona el pokemon que deseas modificar: ");
                    ArrayList <Integer> index = new ArrayList<>();
                    for (int i = 0; i < listaPokemon.size(); i++) {
                        if (listaPokemon.get(i) instanceof FireType && listaPokemon.get(i).isCaptura() == true) {
                            System.out.println((i + 1) + ". " + listaPokemon.get(i));
                            index.add(i);
                        } else {

                        }

                    }
                    
                    int eleccionPokemon = mcgregor.nextInt();
                    if(eleccionPokemon>index.size()){
                        System.out.println("Error, has intentado seleccionar un pokemon no existente, porfavor vuelve a intentarlo");
                    }
                    else{
                        int d=1;
                        while(d==1){
                        System.out.println("Que desea modificar del pokemon?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Numero de entrada en la pokedex");
                        System.out.println("3. Potencia de llamas");
                        
                        
                        int modificacion = mcgregor.nextInt();
                        if(modificacion==1){
                            System.out.println("Ingrese el nuevo nombre: ");
                            String newNombre = mcgregorstring.nextLine();
                            
                            listaPokemon.get(index.get(eleccionPokemon-1)).setNombre(newNombre);
                            d=0;
                        }
                        
                        else if(modificacion==2){
                            System.out.println("Ingrese el nuevo numero de entrada: ");
                            int newNumero = mcgregor.nextInt();
                            listaPokemon.get(index.get(eleccionPokemon-1)).setEntrada(newNumero);
                            d=0;
                        }
                        else if(modificacion ==3){
                            System.out.println("Ingrese la nueva potencia de las llamas");
                            int newPotencia = mcgregor.nextInt();
                            ((FireType)listaPokemon.get(index.get(eleccionPokemon-1))).setPotenciaLlamas(newPotencia);
                            d=0;
                        }
                        else{
                            System.out.println("Error, numero invalido, vuelva a intentarlo");
                        }
                        }
                        
                        c=0;
                        b=0;
                    }
                    
                    
                    }
                    
                } // Fire Type modificar
                else{
                    System.out.println("Has elegido un tipo invalido, porfavor vuelve a intentarlo ");
                }
                
                        }
                }
            }// MODIFICAR
            else if(opcionMenu1==8){
                a=0;
                System.out.println("Has finalizado el programa :( ");
            }
        }// Fin del menu
        
        
        
        
    }// Fin del main
    
}//Fin de la clas

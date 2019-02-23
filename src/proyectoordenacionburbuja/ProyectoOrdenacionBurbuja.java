package proyectoordenacionburbuja;
import java.util.Random;/*Implementación de la librería Random, la cual nos 
permitirá la generación de números aleatorios del tipo que deseemos*/
/**
 *  **PRO (UT6) - Ejercicios**
 * 2.- Ordenar: Realiza un programa que cree un vector de 50 posiciones cargado 
 * con valoares aleatorios. Los valores aleatorios deberán de estar entre el 1 y 
 * el 100. Una vez cargado el vector deberá de ordenarlos mediante el método de 
 * la burbuja y mostrarlo ordenado por pantalla
 * 
 * @author Alberto Julio García Fernández
 */
public class ProyectoOrdenacionBurbuja {
    final static public int POS=50;
    public static void main(String[] args) {
        //Declaración de una variable de clase Array (de elementos int):
        int[] array;
        //Creación de un objeto llamado array de la clase Array
        array=new int[POS];
        //Declaración de una variable de la clase Random:
        Random randomNumber;
        //Creación de un objeto de la clase Random:
        randomNumber=new Random();
        /*Declaración de las variables que necesitaremos para recorrer el array 
        de valores enteros, así como para almacenar los valores máximos:*/
        int num, pos, max;   
        
        System.out.println("\t**EJERCICIO 2 - ORDENACIÓN ARRAY (BURBUJA)**");
        
        //Carga del array con números enteros aleatoriamente elegidos:
        for(num=0;num<array.length;num++){
            /*Con el método nextInt(6) le estamos diciendo que coja valores 
            enteros que estén entre el rango 0-100:*/
            array[num]=randomNumber.nextInt(100);
        }
        
        System.out.println("El array se ha cargado con los siguientes elementos:");
        for(num=0;num<array.length;num++){
            System.out.println("Posición "+(num+1)+"-> "+array[num]+"\n");
        }
       
        //Método de ordenación burbuja:
        for(num=0;num<array.length;num++){/*Bucle general desde el cual nos 
            moveremos siempre desde el primer elemento (num=0), hasta el último 
            elemento del array (num<array.length):*/
            for(pos=0;pos<array.length-1;pos++){/*Bucle secundario en el que 
                iremos comparando el elemento en el que nos encontremos situados, 
                con el inmediatamente siguiente, hasta que lleguemos al antepenúltimo 
                elemento del array (no podremos llegar al último, ya que si lo 
                hiciésemos así, estaríamos comparando el último elemento (cuya 
                posición sería array.length-1), con el siguiente (array.length), 
                lo cual daría un error al salirse de los límites del array:*/
                if(array[pos]>array[pos+1]){
                    max=array[pos];
                    array[pos]=array[pos+1];
                    array[pos+1]=max;
                }
            }                            
        }                
        
        //Mostramos el array ordenado:
        System.out.println("El array ordenado ha quedado de la siguiente manera:");
        for(num=0;num<array.length;num++){
            System.out.println("Posición "+(num+1)+"-> "+array[num]+"\n");
        }        
    }    
}

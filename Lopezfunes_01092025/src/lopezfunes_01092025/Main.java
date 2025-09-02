/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lopezfunes_01092025;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        matriz();
    }
    
    public static void matriz (){
    //se instancia el scanner para lectura de teclado
    Scanner scanner = new Scanner(System.in);
    
    //se instancia la matriz de tipo integrer 
    int[][] matriz = new int [3][3];
    int suma = 0;// variable para suma de valores 
    int total_elementos = 0;//contador de elementos de matriz 
    double promedio = 0;//calculo promedio de edades digitales 
    
    //valida al usuario 
    System.out.println("Ingrese los valores para una matriz 3 x 3");
    
    //recorre las filas de la estrucutura iterativa de tipo for 
    for(int i=0; i<matriz.length; i++){
        
        //cada iteraccion debera obtener la cantidad de elementos que existe en el arreglo 
        total_elementos += matriz[i].length;
        //se recorre las columnas de la matriz con una estructura de control iterativa del tipo for 
        for(int j = 0; j < matriz[i].length; j++){
            //se vuelve un array 
            //se imprime la peticion del usuario 
            System.out.println("Elementos [ " +i+ "] [" +j+ "]");
            //se hace lectura de teclado 
            matriz[i][j] = scanner.nextInt();
        }//cierre de for para columnas 
    }//cierre de for para columnas 
    
    System.out.println("Matriz ingresada: ");
    
    //se recorren las filas de la matriz 
    for(int x = 0; x < matriz.length; x++){
        
        //se recorren las columnas de la matriz 
        for(int y=0; y < matriz[x].length; y++){
            
            System.out.print(matriz[x][y]+" ");
            
            //se suman los valores digitados en cada celda 
            suma += matriz[x][y];
        }
        //se imprime un salto de linea 
        System.out.println();
    }
    
    promedio = (double) suma/total_elementos;
    System.out.println(suma+" es la sumatoria total de elementos, la cantidad de elementos digitados es de: "+total_elementos);
    System.out.println("El promedio de edad es: "+promedio);
    
}
    
    
    
    
    
    
}

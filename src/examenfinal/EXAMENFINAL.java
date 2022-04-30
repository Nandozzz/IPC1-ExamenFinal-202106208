
package examenfinal;


import java.util.Scanner;
public class EXAMENFINAL {


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        
    
    int opcion;
    int numa,numb; //variables del primer problema
    int num;
    
    
    
                System.out.println("        FINAL - 202106208         "); 
                System.out.println("1. COMPARAR DOS NUMEROS");
                System.out.println("2. PIRAMIDE DE NUMEROS IMPARES");
                System.out.println("3. Salir");
                System.out.println("\n");  
    
    
    
    System.out.println("Escoja una opcion: ");
    opcion = entrada.nextInt();
    
    
    switch(opcion)
    {
        
        //Problema 1
        case 1:
        System.out.println("COMPARAR DOS NUMEROS");
        
            System.out.println("Ingrese numero 1: ");
            numa= entrada.nextInt();
            
            System.out.println("Ingrese numero 2: ");
            numb= entrada.nextInt();
        
        
        if(numa>numb)
        {
            System.out.println("El numero mayor es: "+numa);
        }
        
        if(numb>numa)
        {
            System.out.println("El numero mayor es: "+numb);
        }
        
        break;
          
        
        
        
        
        
        //Problema 2
        case 2:
        System.out.println("PIRAMIDE DE NUMEROS IMPARES");
        
        System.out.println ("Introduzca numero de filas: ");
        num= entrada.nextInt();
        
        if(num% 2 == 0)
        {
            System.out.println("Su numero no es impar");    
        }
        else
        {
  
        System.out.println();
        for(int a = 1; a<=((num/2)+1); a++){
            for(int b = 1; b<=(num)-a; b++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(a*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        }
        
        break;
         
        
        
        
        
        case 3:
        System.out.print("PRODUCCION LECHE ");
        

        int peso[]={400,360,250,180,90,50};
        
        int pesoa[]={100,150,155,200,200,223,243,300};
        int leche[]={1,28,29,31,30,34,45,50};
        
        
        
        
        
        break;
    
    }
    

    
    
    }
    
}

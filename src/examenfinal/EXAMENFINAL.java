
package examenfinal;


import java.util.Scanner;
public class EXAMENFINAL {


    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        
    
    int opcion;
    
    System.out.println("Escoja una opción: ");
    opcion = entrada.nextInt();
    
    
    switch(opcion)
    {
        case 0:
        System.out.print("#");           
        break;
                    
        case 1:
        System.out.print("$");
                            
        break;
                        
        case 2:
        System.out.print("@");                            
        break;
    
    }
    

    
    
    }
    
}

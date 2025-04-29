
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Primeira Nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        float m =(n1+n2)/2;
        
        System.out.println("Sua media foi: " + m);
        
        if(m>9){
            System.out.println("PARABENS pequeno gafanhoto!! ");
        }else {
            System.out.println("REPROVADO");
        }
        
      
    }
    
}


package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        // TODO code application logic here
        int s =0;
        int n;
        String l;
        Scanner teclado= new Scanner (System.in);
        
        do{
        System.out.println("Digite um numero: ");
        n = teclado.nextInt();
        s += n;
        System.out.println("Deseja continuar [s] ou [n]?? ");
        l = teclado.next();
        
        } while (l.equals("s"));
        
        
    }
    
}

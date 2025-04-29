
package programapernas;

import java.util.Scanner;
        
        
public class ProgramaPernas {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner (System.in);
        System.out.println("Quntas Pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        
        switch(perna){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 3:
                tipo = "tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6:
                tipo = " Aranha";
                break;
            default:
                tipo = "ET";
                break;
                        
        }
        System.out.println(tipo);
        
    }
    
}

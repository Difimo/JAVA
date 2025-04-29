
package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
      
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano vc nasceu?");
        int nasc = t.nextInt();
        int i = 2015 - nasc;
        
        if(i<18){
            System.out.println("Voce é menor de idade");
        }else{
            System.out.println("Voce é maior de idade");
        }
        
        
    }
    
}

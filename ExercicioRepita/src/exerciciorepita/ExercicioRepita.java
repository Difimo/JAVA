
package exerciciorepita;

import javax.swing.JOptionPane;


public class ExercicioRepita {
    
    /*
    total de valores
    total de pares
    total de impares
    acima de 100
    media 40
    
    */

   
    public static void main(String[] args) {
        int n;
        int i=0;
        int ti =0;
        int tp=0;
        int a100 = 0;
        int s = 0; // armazena a soma de todos os numeros
        float media = 0;
        
       do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));
        //JOptionPane.showMessageDialog(null, "Voce digitou o valor: " + n);
        
        if (n!=0){
            i++; // armazena a quantidade de numeros validos.
            s += n; // calcula a somatoria de todos os numeros
            } 
        if(n>=100){ // armazena o total de numeros acima de 100
                a100 ++;
            }
        if(n%2 == 0){ // testa se e par ou impar e armazena  a soma deles 
            tp += n;          
        }else{
            ti +=n;
        }
        // vai calcular a media dos valores digitados       
        media = s / i;
        
        
       } while (n != 0);
       
       JOptionPane.showMessageDialog(null, 
               "<html>RESULTADO<hr><br> " +
               "<br>O Total da somatoria foi: " +s+ 
               "<br>O Total de pares foi: " +tp+ 
               "<br>O total de impares foi: "+ti+
               "<br>A Media dos numeros digitados foi: "+media+
               "<br>O Total de numeros digitados foi: "+i+
               "<br>O Total de numeros acima de 100 foi: " +a100+
                       "</html>");
    }
    
}

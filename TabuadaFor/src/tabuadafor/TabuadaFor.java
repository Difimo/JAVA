
package tabuadafor;


public class TabuadaFor {

  
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            System.out.println("**********************");
            System.out.println("T A B U A D A  do "+ i);
            System.out.println("**********************");
            for(int j = 1; j<=10; j++){
                int r =0;
                r = i * j;                       
                System.out.println( i + " x " + j + " = " + r);
            }
        }
    }
    
}

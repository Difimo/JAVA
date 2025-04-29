
package operadoresaritimeticos;



public class OperadoresAritimeticos {


    public static void main(String[] args) {
       /*int n1 =3;
       int n2 =5;
       float m = (n1+n2) /2;
       
        System.out.println("A media é igual a " + m);*/
        
        /*int n = 5;
        int valor = 5;
        System.out.println("escreva: " + n++);
        System.out.println("escreva: " + n++);*/
        
        // gerando numero aleatorio entre 1 e 100
        double ale = Math.random();
        int n= (int) (1 + ale * (100-1));
        System.out.println(n);
    }
    
}

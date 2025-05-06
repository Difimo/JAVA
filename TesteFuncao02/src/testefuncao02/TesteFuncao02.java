
package testefuncao02;


public class TesteFuncao02 {

    
    public static void main(String[] args) {
        
        System.out.println("Vai comecar a contagem ");
       int v0 = 3; // 3- 4
       int v1 = v0++; //3 
      
       int v2 = ++v1; // 5
        System.out.println(v0+","+v1+","+v2);
       v1 +=v0;
       v2 +=  --v1;
       
        System.out.println(v0+","+v1+","+v2);
        
        
    }
    
}

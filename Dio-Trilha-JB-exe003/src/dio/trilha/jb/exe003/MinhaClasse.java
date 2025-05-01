/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dio.trilha.jb.exe003;

public class MinhaClasse {
    
    public static void main(String[] args) {

        String pNome = "Diego";
        String sNome = "Figueiredo";
        
        String sNomeCompleto = sNomeCompleto(pNome, sNome);
        
          System.out.println(sNomeCompleto);

    }
    
    public static String sNomeCompleto(String pNome, String sNome) {
            return pNome.concat(" ").concat(sNome); 
        }    
    
}  

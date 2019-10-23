/*

                     atividade herança
 
 */
package Loja;

/**
 *
 * @author Aluno
 */
public class LojaAberta {
    public static void main(String[] args) {
        Vendedor v = new Vendedor(0, "Niedson", "070.680.938-68", 1900);
        Administrativo adm = new Administrativo(0, "Laura", "453.178.287-91", 2800);
        v.setVendas(900);
        adm.setHoras(20);
       System.out.println(v.toString());;
       System.out.println(adm.toString());
        
    }
}

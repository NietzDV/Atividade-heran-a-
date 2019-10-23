/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja;

/**
 *
 * @author Aluno
 */
public class Vendedor extends Funcionario {
    private double vendas;

    public Vendedor(double vendas, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.vendas = vendas;
    }
    
   

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    
    @Override
     public double calculaPagamento(){
         return getSalario() + (getVendas() * 0.10) ;
     }

  
    @Override
    public String toString() {
        return "Vendedor " +getNome()+ " com cpf " + getCpf() + " receberá: "+ calculaPagamento();
    }
    
   
    
}

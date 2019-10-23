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
public class Administrativo extends Funcionario {
    private double horas;

    public Administrativo(double horas, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.horas = horas;
    }
    
    

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    @Override
    public double calculaPagamento(){
        return getSalario() + (getHoras() * (getSalario() * 0.01)) ;
    }

    
    public String toString() {
        return "ADM " +getNome()+ " com cpf " + getCpf() + " receberá: "+ calculaPagamento();
    }
    
   
    
}

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
public class Funcionario {
    
    private String nome;
    private String cpf;
    private double salario;
    
    
    public Funcionario(String nome, String cpf,  double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaPagamento(){
      
     return salario + (salario * 0.03);
    }

        
        
    
    
    
}

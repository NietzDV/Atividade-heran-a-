/*   

  Não foi usada, porem vou usala na proxima atividade

 */
package Loja;

/**
 *
 * @author Aluno
 */
public class Cliente {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + '}';
    }
   
    
    
    
}

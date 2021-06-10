/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barber;

/**
 *
 * @author felip
 */
public class Cliente {
    String nome;
    long cpf;
    String login;
    String id;
     
    void mostrarValores() {
       
}
    void mostrarAgendamento(){
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
}
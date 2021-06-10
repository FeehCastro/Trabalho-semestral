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
public class Agendamento {
    int id;
    String nome;
    long cpf;
    String login;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf
     */
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

void horariosDisponiveis(){
}    

void cancelarAgendamento(){
}

void alterarHorario(){}    
}

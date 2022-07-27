package Administracao;

import Transporte.Caminhao;

public class Recepcao {
    private String nome;
    private int totalRecepcao;
    private boolean disponivel;
    private Caminhao atual;

    public Recepcao(String nome) {
        this.nome = nome;
        totalRecepcao = 0;
        disponivel = true;
        atual = null;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalRecepcao() {
        return totalRecepcao;
    }
    public void incrementarTotal(int quantidade){
        this.totalRecepcao += quantidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public Caminhao getAtual() {
        return atual;
    }
    public void setAtual(Caminhao atual) {
        this.atual = atual;
    }









    
}

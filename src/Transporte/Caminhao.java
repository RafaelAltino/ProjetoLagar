package Transporte;

import Plantacoes.Plantacao;

public class Caminhao {
    private String placa;
    private int capacidade;
    private Plantacao origem;
    private CaminhaoEstado estado;

    public Caminhao(String placa, int capacidade, Plantacao origem){
        this.placa = placa;
        this.capacidade = capacidade;
        this.origem = origem;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public Plantacao getOrigem() {
        return origem;
    }
    public void setOrigem(Plantacao origem) {
        this.origem = origem;
    }
    public CaminhaoEstado getEstado() {
        return estado;
    }
    public void setEstado(CaminhaoEstado estado) {
        this.estado = estado;
    }
    

}

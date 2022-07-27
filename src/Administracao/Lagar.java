package Administracao;
import java.util.ArrayList;
import java.util.List;
import Transporte.Caminhao;

public class Lagar {
    private List<Recepcao> recepcoes;
    private List<Caminhao> filaDeEspera;
    private int totalAzeitonas;

    public Lagar(){
        this.recepcoes = new ArrayList<>();
        this.filaDeEspera = new ArrayList<>();
        this.totalAzeitonas = 0;
    }

    public List<Recepcao> getRecepcoes() {
        return recepcoes;
    }
    public void adicionarRecepcao(Recepcao recepcao){
        recepcoes.add(recepcao);
    }
    public Recepcao getRecepcaoEspecifica(String nome){
        for(int i = 0; i < recepcoes.size(); i++){
            if(recepcoes.get(i).getNome().equals(nome)){
                return recepcoes.get(i);
            }
        }
        System.out.println("Não existe essa recepção na lista");
        return null;
    }

    public List<Caminhao> getCaminhoes() {
        return filaDeEspera;
    }

    public void adicionarCaminhao(Caminhao caminhao){
        filaDeEspera.add(caminhao);
    }

    public Caminhao getCaminhaoEspecifico(String placa){
        for(int i = 0; i < filaDeEspera.size(); i++){
            if(filaDeEspera.get(i).getPlaca().equals(placa)){
                return filaDeEspera.get(i);
            }
        }
        System.out.println("Não existe esse caminhão na lista");
        return null;
    }

    public int getTotalAzeitonas() {
        return totalAzeitonas;
    }
    public void incrementarTotal(int quantidade){
        totalAzeitonas += quantidade;
    }
}

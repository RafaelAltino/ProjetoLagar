package Plantacoes;

public class Plantacao {
    private String nome;
    private TipoDeAzeitona azeitona;
    private int distanciaDoLagarSegundos;
    private boolean produzindo;

    public Plantacao(TipoDeAzeitona azeitona, int distanciaDoLagarSegundos) {
        this.azeitona = azeitona;
        this.distanciaDoLagarSegundos = distanciaDoLagarSegundos;
        this.produzindo = true;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoDeAzeitona getAzeitona() {
        return azeitona;
    }
    public void setAzeitona(TipoDeAzeitona azeitona) {
        this.azeitona = azeitona;
    }

    public int getDistanciaDoLagarSegundos() {
        return distanciaDoLagarSegundos;
    }
    public void setDistanciaDoLagarSegundos(int distanciaDoLagarSegundos) {
        this.distanciaDoLagarSegundos = distanciaDoLagarSegundos;
    }

    public boolean isProduzindo() {
        return produzindo;
    }
    public void setProduzindo(boolean produzindo) {
        this.produzindo = produzindo;
    }
    
    public void carregaCaminhoes(){
        new Thread( () -> {
            while(true){
                if(false){

                }
            }

        }).start();
    }




}

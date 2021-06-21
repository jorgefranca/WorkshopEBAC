package oficina;

import veiculo.Veiculo;

public class OficinaCarroMoto extends Oficina {

    private double orcamento = 100.0;
    private Pecas pecas;

    public OficinaCarroMoto(Veiculo veiculo, Pecas pecas){
        super(veiculo, pecas);
        this.pecas = pecas;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void calculaOrcamento() {
        for(double i : pecas.getValor()){
            this.orcamento = this.orcamento + i;
        }
    }
    
}

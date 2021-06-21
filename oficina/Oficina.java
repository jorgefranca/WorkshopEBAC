package oficina;

import veiculo.Veiculo;

public class Oficina {
    
    private Veiculo veiculo;
    private Pecas pecas;
    private double orcamento;
    private int diasParaEntrega = 0;
   
    public Oficina(Veiculo veiculo, Pecas pecas){
        this.veiculo = veiculo;
        this.pecas = pecas;

    }
    public Pecas getPecas(){
        return pecas;
    }
    public void setPecas(Pecas pecas){
        this.pecas = pecas;
    }

    public double getOrcamento(){
        return orcamento;
    }

    public void calculaOrcamento() {
        for(double i : pecas.getValor()){
            this.orcamento = this.orcamento + i;
        }
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getDiasParaEntrega() {
        return diasParaEntrega;
    }

    public void setDiasParaEntrega(int diasParaEntrega) {
        this.diasParaEntrega = this.diasParaEntrega + diasParaEntrega;
    }

    public void getDetalhes(){
        System.out.println("-----");
        System.out.println("Veículo " + veiculo.getMarca() +" "+ veiculo.getModelo() +" "+ veiculo.getPlaca());
        System.out.println(veiculo.getObservacao());
        System.out.println("Defeitos na(s) peça(s):");
        
        for (String n : pecas.getNome()){
            System.out.println(" - " + n);
        }
        
        System.out.println("Custo: ");
        System.out.println(" - " + getOrcamento()); 
        System.out.println("-----");   
    }    
 

    
}

package veiculo;
public class Carro extends Veiculo{

    private String placa;
    private boolean direcaoHidraulica;
   // private Pecas pecasComDefeito;

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;        
    }

    @Override
    public String getPlaca() {
        return placa;
    }
    
    public void setDirecaoHidraulica(boolean d){
        this.direcaoHidraulica = d;
    }
    public boolean getDirecaoHidraulica(){
        return direcaoHidraulica;
    }
}
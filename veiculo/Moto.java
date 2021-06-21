package veiculo;

public class Moto extends Veiculo{

    private String placa;

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
        
    }

    @Override
    public String getPlaca() {
        return placa;
    } 

}
